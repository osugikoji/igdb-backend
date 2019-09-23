package br.com.steam.documents

import br.com.steam.jsonPojo.Screenshot
import br.com.steam.jsonPojo.Video
import com.google.gson.JsonParser
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("steam_media_data")
data class GameMedia(
        @Id
        val id: String,
        @Field("steam_appid")
        val gameDetailsId: Int?,
        @Field("header_image")
        val headerImage: String?,
        @Field("screenshots")
        private val jsonScreenshots: String?,
        val background: String?,
        @Field("movies")
        private val jsonVideos: String?
) {

    /**
     * Converte [jsonScreenshots] para uma lista de [Screenshot]
     */
    fun getScreenshotList(): List<Screenshot>? =
            if (jsonScreenshots == null) null
            else JsonParser().parse(jsonScreenshots).asJsonArray.map { Screenshot(it) }

    /**
     * Converte [jsonVideos] para uma lista de [Video]
     */
    fun getVideoList(): List<Video>? =
            if (jsonVideos == null) null
            else JsonParser().parse(jsonVideos).asJsonArray.map { Video(it) }
}

