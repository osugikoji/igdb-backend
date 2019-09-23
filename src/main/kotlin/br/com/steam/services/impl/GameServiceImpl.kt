package br.com.steam.services.impl

import br.com.steam.dto.GameCatalogDTO
import br.com.steam.dto.GameDTO
import br.com.steam.enums.GameCatalogSortEnum
import br.com.steam.repositories.*
import br.com.steam.services.interfaces.GameService
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service


@Service
class GameServiceImpl constructor(
        private val gameDetailsRepository: GameDetailsRepository,
        private val gameDescriptionRepository: GameDescriptionRepository,
        private val gameMediaRepository: GameMediaRepository,
        private val gameRequirementsRepository: GameRequirementsRepository,
        private val gameSupportRepository: GameSupportRepository
) : GameService {

    override fun getAllGameCatalog(): List<GameCatalogDTO> =
            GameCatalogSortEnum.values().map { enum -> buildGameCatalog(enum) }

    private fun buildGameCatalog(gameCatalogSortEnum: GameCatalogSortEnum): GameCatalogDTO {
        val pageRequest = PageRequest.of(0, 10, gameCatalogSortEnum.sort)

        val gameDTOList = gameDetailsRepository.findAll(pageRequest).map { gameDetails ->
            val gameDescription = gameDescriptionRepository.findByGameDetailsId(gameDetails.id)
            val gameMedia = gameMediaRepository.findByGameDetailsId(gameDetails.id)
            val gameRequirements = gameRequirementsRepository.findByGameDetailsId(gameDetails.id)
            val gameSupport = gameSupportRepository.findByGameDetailsId(gameDetails.id)
            GameDTO(gameDetails, gameDescription, gameRequirements, gameMedia, gameSupport)
        }.toList()

        return GameCatalogDTO(gameCatalogSortEnum.description, gameDTOList)
    }
}