package br.com.steam.enums

import br.com.steam.utility.ConstDocumentField
import br.com.steam.utility.I18n
import org.springframework.data.domain.Sort

enum class GameCatalogSortEnum(val description: String, val sort: Sort) {

    MOST_POSITIVE_RATINGS(I18n.MOST_POSITIVE_RATINGS.value, Sort(Sort.Direction.DESC, ConstDocumentField.POSITIVE_RATINGS)),
    RECENT_RELEASES(I18n.RECENT_RELEASES.value, Sort(Sort.Direction.DESC, ConstDocumentField.RELEASE_DATE))

}