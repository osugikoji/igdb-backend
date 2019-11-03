package br.com.igdb.jsonPojo

import com.google.gson.JsonElement

/**
 * Classe que armazena os valores convertidos de [json]
 */
data class Screenshot(
        private val json: JsonElement,

        val id: Int = json.asJsonObject.get("id").asInt,
        val thumbnailImage: String = json.asJsonObject.get("path_thumbnail").asString,
        val fullImage: String = json.asJsonObject.get("path_full").asString
)