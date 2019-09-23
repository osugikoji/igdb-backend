package br.com.steam.dto

import br.com.steam.jsonPojo.Screenshot

data class ScreenshotDTO(
        private val screenshot: Screenshot? = null,

        val thumbnailImage: String? = screenshot?.thumbnailImage,
        val fullImage: String? = screenshot?.fullImage
)
