package br.com.steam.services.impl

import br.com.steam.documents.GameDetails
import br.com.steam.documents.GameReview
import br.com.steam.dto.GameCatalogDTO
import br.com.steam.dto.GameDTO
import br.com.steam.dto.GameReviewDTO
import br.com.steam.dto.GameReviewSearchDTO
import br.com.steam.enums.GameCatalogSortEnum
import br.com.steam.enums.SortEnum
import br.com.steam.repositories.*
import br.com.steam.services.interfaces.GameService
import br.com.steam.utility.extensions.getDTO
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.stereotype.Service


@Service
class GameServiceImpl constructor(
        private val mongoTemplate: MongoTemplate,
        private val gameDetailsRepository: GameDetailsRepository,
        private val gameDescriptionRepository: GameDescriptionRepository,
        private val gameMediaRepository: GameMediaRepository,
        private val gameRequirementsRepository: GameRequirementsRepository,
        private val gameSupportRepository: GameSupportRepository,
        private val gameReviewRepository: GameReviewRepository
) : GameService {

    override fun getAllGameCatalog(): List<GameCatalogDTO> =
            GameCatalogSortEnum.values().map { enum -> buildGameCatalog(enum) }

    private fun buildGameCatalog(gameCatalogSortEnum: GameCatalogSortEnum): GameCatalogDTO {
        val gameDTOList = mongoTemplate.find(gameCatalogSortEnum.query, GameDetails::class.java, "steam").map { gameDetails ->
            val gameDescription = gameDescriptionRepository.findByGameDetailsId(gameDetails.id)
            val gameMedia = gameMediaRepository.findByGameDetailsId(gameDetails.id)
            val gameRequirements = gameRequirementsRepository.findByGameDetailsId(gameDetails.id)
            val gameSupport = gameSupportRepository.findByGameDetailsId(gameDetails.id)
            GameDTO(gameDetails, gameDescription, gameRequirements, gameMedia, gameSupport)
        }.toList()

        return GameCatalogDTO(gameCatalogSortEnum.description, gameDTOList)
    }

    override fun getAllGameReview(gameReviewSearchDTO: GameReviewSearchDTO): List<GameReviewDTO> {
        val sort = when (SortEnum.getByName(gameReviewSearchDTO.sortEnum)) {
            SortEnum.RECENT -> Sort(Sort.Direction.DESC, "date_posted")
            SortEnum.OLD -> Sort(Sort.Direction.ASC, "date_posted")
            SortEnum.TOP -> Sort(Sort.Direction.DESC, "positive")
            SortEnum.CONTROVERSIAL -> Sort(Sort.Direction.DESC, "negative")
            else -> Sort(Sort.Direction.DESC)
        }

        val page = gameReviewSearchDTO.page
        val pageSize = gameReviewSearchDTO.size
        val pageable = PageRequest.of(page, pageSize, sort)

        val regex = ".*${gameReviewSearchDTO.gameTitle}.*"
        val query = Query().with(pageable).addCriteria(Criteria.where("title").regex(regex, "i"))

        val gameReviewList = mongoTemplate.find(query, GameReview::class.java, "steam_reviews")
        val gameReviewDTOList: List<GameReviewDTO>? = gameReviewList.map { gameReview -> gameReview.getDTO() }

        return gameReviewDTOList ?: listOf(GameReviewDTO())
    }
}