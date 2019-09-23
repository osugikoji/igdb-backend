package br.com.steam.utility

import br.com.steam.config.Translator

enum class I18n(val value: String) {

    MOST_POSITIVE_RATINGS(Translator.toLocale("most.positive.ratings")),
    RECENT_RELEASES(Translator.toLocale("recent.releases"))

}