package br.com.steam.enums

enum class RecommendationEnum(val id: Int, val serverName: String) {

    RECOMMENDED(1, "Recommended"),

    NOT_RECOMMENDED(2, "Not Recommended");

    companion object {
        fun getById(id: Int?): RecommendationEnum? =
                values().find { recommendation -> recommendation.id == id }
    }
}