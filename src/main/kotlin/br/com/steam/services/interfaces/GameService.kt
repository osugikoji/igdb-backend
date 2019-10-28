package br.com.steam.services.interfaces

import br.com.steam.dto.GameCatalogDTO
import br.com.steam.dto.GameDTO
import br.com.steam.dto.GameReviewDTO
import br.com.steam.dto.GameReviewSearchDTO

interface GameService {

    fun getAllGameCatalog(): List<GameCatalogDTO>

    fun getAllGameReview(gameReviewSearchDTO: GameReviewSearchDTO): List<GameReviewDTO>

    fun getGames(key: Int, value: String, size: Int, page: Int): List<GameDTO>

}