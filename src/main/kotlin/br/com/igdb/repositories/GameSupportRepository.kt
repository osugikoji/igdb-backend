package br.com.igdb.repositories

import br.com.igdb.documents.GameSupport
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface GameSupportRepository : MongoRepository<GameSupport, String> {

    @Query("{'steam_appid' : ?0 }")
    fun findByGameDetailsId(gameDetailsId: String?): GameSupport?

}
