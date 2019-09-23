package br.com.steam.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("steam_support_info")
data class GameSupport(
        @Id
        val id: String,
        @Field("steam_appid")
        val gameDetailsId: Int?,
        val website: String?,
        @Field("support_url")
        val supportUrl: String?,
        @Field("support_email")
        val supportEmail: String?
)
