package br.com.igdb.dto

data class GameReviewDTO(
        val datePosted: String? = null,
        val negative: Long? = null,
        val positive: Long? = null,
        val hoursPlayed: Long? = null,
        val recommendation: String? = null,
        val review: String? = null,
        val userName: String? = null,
        val avatarId: Int? = null
)



