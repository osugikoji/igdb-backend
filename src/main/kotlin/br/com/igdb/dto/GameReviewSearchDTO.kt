package br.com.igdb.dto

data class GameReviewSearchDTO(
        val gameTitle: String?,
        val page: Int,
        val size: Int,
        val sortEnum: String
)