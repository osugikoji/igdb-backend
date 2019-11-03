package br.com.igdb.enums

import br.com.igdb.utility.ConstDocumentField
import br.com.igdb.utility.I18n
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query

enum class GameCatalogSortEnum(val description: String, val query: Query) {

    MOST_POSITIVE_RATINGS(I18n.MOST_POSITIVE_RATINGS.value,
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.POSITIVE_RATINGS)))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))),

    RECENT_RELEASES(I18n.RECENT_RELEASES.value,
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.RELEASE_DATE)))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))),

    MOST_PLAYED_FREE_GAMES(I18n.MOST_PLAYED_FREE_GAMES.value,
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.AVERAGE_PLAY_TIME)))
                    .addCriteria(Criteria.where("price").`is`("0.0"))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))),

    MOST_PLAYED_RPG_GAMES(I18n.MOST_PLAYED_RPG_GAMES.value,
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.AVERAGE_PLAY_TIME)))
                    .addCriteria(Criteria.where("genres").`is`("RPG"))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))),

    MULTI_PLAYER(I18n.MULTI_PLAYER.value,
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.AVERAGE_PLAY_TIME)))
                    .addCriteria(Criteria.where("categories").`is`("Multi-player"))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1")))
}