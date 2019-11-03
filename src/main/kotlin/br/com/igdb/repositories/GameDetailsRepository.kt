package br.com.igdb.repositories

import br.com.igdb.documents.GameDetails
import org.springframework.data.mongodb.repository.MongoRepository

interface GameDetailsRepository : MongoRepository<GameDetails, String>
