package br.com.steam.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("steam_description_data")
data class GameDescription(
        @Id
        val id: String,
        @Field("steam_appid")
        val gameDetailsId: Int?,
        @Field("detailed_description")
        val description: String?,
        @Field("about_the_game")
        val aboutTheGame: String?,
        @Field("short_description")
        val shortDescription: String?
)