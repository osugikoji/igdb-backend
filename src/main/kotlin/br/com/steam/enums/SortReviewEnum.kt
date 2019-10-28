package br.com.steam.enums

enum class SortReviewEnum() {

    RECENT(),

    TOP(),

    OLD(),

    CONTROVERSIAL();

    companion object {

        fun getByName(name: String): SortReviewEnum? =
                values().find { feedback -> feedback.name == name }

    }

}