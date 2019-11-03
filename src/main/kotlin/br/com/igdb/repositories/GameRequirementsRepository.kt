package br.com.igdb.repositories

import br.com.igdb.documents.GameRequirements
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface GameRequirementsRepository : MongoRepository<GameRequirements, String> {

    @Query("{'steam_appid' : ?0 }")
    fun findByGameDetailsId(gameDetailsId: String?): GameRequirements?

}
