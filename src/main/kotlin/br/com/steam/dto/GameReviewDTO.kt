package br.com.steam.dto

data class GameReviewDTO(
        val datePosted: String? = null,
        val negative: Int? = null,
        val positive: Int? = null,
        val hoursPlayed: Int? = null,
        val recommendation: String? = null,
        val review: String? = null
)



