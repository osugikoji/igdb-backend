package br.com.steam.repositories

import br.com.steam.documents.GameRequirements
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface GameRequirementsRepository : MongoRepository<GameRequirements, String> {

    @Query("{'steam_appid' : ?0 }")
    fun findByGameDetailsId(gameDetailsId: String): GameRequirements?

}
