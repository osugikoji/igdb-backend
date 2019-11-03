package br.com.igdb.jsonPojo

import com.google.gson.JsonElement

/**
 * Classe que armazena os valores convertidos de [json]
 */
data class Video(
        private val json: JsonElement,

        val id: Int = json.asJsonObject.get("id").asInt,
        val name: String = json.asJsonObject.get("name").asString,
        val thumbnailVideo: String = json.asJsonObject.get("thumbnail").asString,
        val lowQualityVideo: String = json.asJsonObject.get("webm").asJsonObject.get("480").asString,
        val highQualityVideo: String = json.asJsonObject.get("webm").asJsonObject.get("max").asString,
        val highlight: Boolean = json.asJsonObject.get("highlight").asBoolean
)