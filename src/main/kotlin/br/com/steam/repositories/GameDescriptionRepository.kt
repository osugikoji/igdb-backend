package br.com.steam.repositories

import br.com.steam.documents.GameDescription
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface GameDescriptionRepository : MongoRepository<GameDescription, String> {

    @Query("{'steam_appid' : ?0 }")
    fun findByGameDetailsId(gameDetailsId: String?): GameDescription?

}