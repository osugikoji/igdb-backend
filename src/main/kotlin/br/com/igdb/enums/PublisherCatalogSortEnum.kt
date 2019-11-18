package br.com.igdb.enums

import br.com.igdb.utility.ConstDocumentField
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query

enum class PublisherCatalogSortEnum(val description: String, val query: Query) {

    VALVE("Valve",
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.POSITIVE_RATINGS)))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))
                    .addCriteria(Criteria.where("publisher").`is`("Valve"))),

    BETHESDA("Bethesda Softworks",
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.POSITIVE_RATINGS)))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))
                    .addCriteria(Criteria.where("publisher").`is`("Bethesda Softworks"))),

    ROCKSTAR("Rockstar Games",
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.POSITIVE_RATINGS)))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))
                    .addCriteria(Criteria.where("publisher").`is`("Rockstar Games"))),

    UBISOFT("Ubisoft",
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.POSITIVE_RATINGS)))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))
                    .addCriteria(Criteria.where("publisher").`is`("Ubisoft"))),

    TWO_K("2K",
            Query().with(PageRequest.of(0, 10, Sort(Sort.Direction.DESC,
                    ConstDocumentField.POSITIVE_RATINGS)))
                    .addCriteria(Criteria.where("hasEnglishSupport").`is`("1"))
                    .addCriteria(Criteria.where("publisher").regex(".*2K.*", "i")))
}