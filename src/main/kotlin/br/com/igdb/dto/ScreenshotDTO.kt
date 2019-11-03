package br.com.igdb.dto

import br.com.igdb.jsonPojo.Screenshot

data class ScreenshotDTO(
        private val screenshot: Screenshot? = null,

        val thumbnailImage: String? = screenshot?.thumbnailImage,
        val fullImage: String? = screenshot?.fullImage
)
