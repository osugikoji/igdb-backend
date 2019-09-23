package br.com.steam.repositories

import br.com.steam.documents.GameDetails
import org.springframework.data.mongodb.repository.MongoRepository

interface GameDetailsRepository : MongoRepository<GameDetails, String>
