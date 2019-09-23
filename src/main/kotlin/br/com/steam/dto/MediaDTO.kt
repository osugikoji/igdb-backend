package br.com.steam.dto

import br.com.steam.documents.GameMedia

data class MediaDTO(
        private val gameMedia: GameMedia? = null,

        val headerImage: String? = gameMedia?.headerImage,
        val screenshotDTO: List<ScreenshotDTO>? = gameMedia?.getScreenshotList()?.map { ScreenshotDTO((it)) },
        val backgroundImage: String? = gameMedia?.background,
        val videoDTO: List<VideoDTO>? = gameMedia?.getVideoList()?.map { VideoDTO(it) }
)