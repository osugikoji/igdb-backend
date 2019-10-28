package br.com.steam.enums

enum class SearchByEnum(val id: Int, val key: String) {

    DEVELOPER(1, "developer"),
    PUBLISHER(2, "publisher"),
    CATEGORIES(3, "categories"),
    GENRES(4, "genres");

    companion object {
        fun getById(id: Int): SearchByEnum? = values().find { it.id == id }
    }

}