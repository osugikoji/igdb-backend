package br.com.igdb.repositories

import br.com.igdb.documents.GameMedia
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface GameMediaRepository : MongoRepository<GameMedia, String> {

    @Query("{'steam_appid' : ?0 }")
    fun findByGameDetailsId(gameDetailsId: String?): GameMedia?

}