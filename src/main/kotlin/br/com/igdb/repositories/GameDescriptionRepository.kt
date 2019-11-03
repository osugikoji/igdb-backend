package br.com.igdb.repositories

import br.com.igdb.documents.GameDescription
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface GameDescriptionRepository : MongoRepository<GameDescription, String> {

    @Query("{'steam_appid' : ?0 }")
    fun findByGameDetailsId(gameDetailsId: String?): GameDescription?

}