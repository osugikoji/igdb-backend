package br.com.igdb.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("steam_requirements_data")
data class GameRequirements(
        @Id
        val id: String,
        @Field("steam_appid")
        val gameDetailsId: Int?,
        @Field("pc_requirements")
        private val jsonPcRequirements: String?,
        @Field("mac_requirements")
        private val jsonMacRequirements: String?,
        @Field("linux_requirements")
        private val jsonLinuxRequirements: String?,
        val minimum: String?,
        val recommended: String?
)
