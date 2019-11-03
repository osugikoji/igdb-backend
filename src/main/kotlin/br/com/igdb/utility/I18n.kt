package br.com.igdb.utility

import br.com.igdb.config.Translator

enum class I18n(val value: String) {

    MOST_POSITIVE_RATINGS(Translator.toLocale("most.positive.ratings")),
    RECENT_RELEASES(Translator.toLocale("recent.releases")),
    MOST_PLAYED_FREE_GAMES(Translator.toLocale("most.played.free.games")),
    MOST_PLAYED_RPG_GAMES(Translator.toLocale("most.played.rpg.games")),
    MULTI_PLAYER(Translator.toLocale("multi.player")),

}