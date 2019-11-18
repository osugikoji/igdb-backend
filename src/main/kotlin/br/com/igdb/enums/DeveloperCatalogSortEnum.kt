package br.com.igdb.enums

import br.com.igdb.utility.ConstDocumentField
import br.com.igdb.utility.I18n
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query

enum class DeveloperCatalogSortEnum(val description: String, val query: Query) {

    LUCAS_ARTS("LucasArts",
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.POSITIVE_RATINGS)))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))
                    .addCriteria(Criteria.where("developer").regex(".*LucasArts.*", "i"))),

    BETHESDA("Bethesda Game Studios",
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.POSITIVE_RATINGS)))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))
                    .addCriteria(Criteria.where("developer").regex(".*Bethesda Game Studios.*", "i"))),

    KONAMI("Konami Digital Entertainment",
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.POSITIVE_RATINGS)))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))
                    .addCriteria(Criteria.where("developer").regex(".*Konami Digital Entertainment.*", "i"))),

    CAPCOM("Capcom",
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.POSITIVE_RATINGS)))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))
                    .addCriteria(Criteria.where("developer").regex(".*Capcom.*", "i"))),

}