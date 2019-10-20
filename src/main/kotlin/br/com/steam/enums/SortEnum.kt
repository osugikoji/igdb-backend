package br.com.steam.enums

enum class SortEnum() {

    RECENT(),

    TOP(),

    OLD(),

    CONTROVERSIAL();

    companion object {

        fun getByName(name: String): SortEnum? =
                values().find { feedback -> feedback.name == name }

    }

}