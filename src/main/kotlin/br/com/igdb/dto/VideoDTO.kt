package br.com.igdb.dto

import br.com.igdb.jsonPojo.Video

data class VideoDTO(
        private val video: Video? = null,

        val name: String? = video?.name,
        val thumbnailVideo: String? = video?.thumbnailVideo,
        val fullImage: String? = video?.thumbnailVideo,
        val lowQualityVideo: String? = video?.lowQualityVideo,
        val highQualityVideo: String? = video?.highQualityVideo,
        val highlight: Boolean? = video?.highlight
)
