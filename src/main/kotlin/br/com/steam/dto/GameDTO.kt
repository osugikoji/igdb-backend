package br.com.steam.dto

import br.com.steam.documents.*
import br.com.steam.utility.extensions.parseToDate
import java.math.BigDecimal

data class GameDTO(
        private val gameDetails: GameDetails? = null,
        private val gameDescription: GameDescription? = null,
        private val gameRequirements: GameRequirements? = null,
        private val gameMedia: GameMedia? = null,
        private val gameSupport: GameSupport? = null,

        val name: String? = gameDetails?.name,
        val description: String? = gameDescription?.shortDescription,
        val releaseDate: String? = gameDetails?.releaseDate?.parseToDate(),
        val developer: String? = gameDetails?.developer,
        val publisher: String? = gameDetails?.publisher,
        val platforms: String? = gameDetails?.platforms,
        val categories: String? = gameDetails?.categories,
        val genres: String? = gameDetails?.genres,
        val achievements: Int? = gameDetails?.achievements,
        val positiveRatings: Int? = gameDetails?.positiveRatings,
        val negativeRatings: Int? = gameDetails?.negativeRatings,
        val price: BigDecimal? = gameDetails?.price,
        val minimumRequirement: String? = gameRequirements?.minimum,
        val recommendedRequirement: String? = gameRequirements?.recommended,
        val supportUrl: String? = gameSupport?.supportUrl,
        val website: String? = gameSupport?.website,
        val supportEmail: String? = gameSupport?.supportEmail,
        val mediaDTO: MediaDTO? = MediaDTO(gameMedia)
)

