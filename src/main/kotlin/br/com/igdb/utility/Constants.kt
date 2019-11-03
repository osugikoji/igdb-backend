package br.com.igdb.utility

object ConstHttp {
    const val GET = "GET"
    const val POST = "POST"
    const val PUT = "PUT"
    const val DELETE = "DELETE"
    const val OPTIONS = "OPTIONS"
    const val HEAD = "HEAD"
    const val TRACE = "TRACE"
    const val CONNECT = "CONNECT"
}

/** Constantes relacionadas aos valores dos documentos da coleção do mongo*/
object ConstDocumentField {

    /** Campo número de avaliações positivas do documento [br.com.igdb.documents.GameDetails.positiveRatings] */
    const val POSITIVE_RATINGS = "positive_ratings"

    /** Campo data de lançamento do documento [br.com.igdb.documents.GameDetails.releaseDate] */
    const val RELEASE_DATE = "release_date"

    /** Campo média jogado [br.com.igdb.documents.GameDetails.averagePlayTime] */
    const val AVERAGE_PLAY_TIME = "averagePlayTime"
}