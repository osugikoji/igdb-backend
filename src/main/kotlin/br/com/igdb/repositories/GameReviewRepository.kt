package br.com.igdb.repositories

import br.com.igdb.documents.GameReview
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface GameReviewRepository : MongoRepository<GameReview, String> {

    @Query("{'title' : ?0 }")
    fun findByGameTitle(gameTitle: String?, pageable: Pageable): List<GameReview>?

    @Query("{'title' : ?0 }")
    fun findByGameTitleLike(gameTitle: String?, pageable: Pageable): List<GameReview>?

    fun countByGameTitle(title: String): Long

}