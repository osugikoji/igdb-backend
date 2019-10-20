package br.com.steam.services.interfaces

import br.com.steam.dto.GameCatalogDTO
import br.com.steam.dto.GameReviewDTO
import br.com.steam.dto.GameReviewSearchDTO

interface GameService {

    fun getAllGameCatalog(): List<GameCatalogDTO>

    fun getAllGameReview(gameReviewSearchDTO: GameReviewSearchDTO): List<GameReviewDTO>

}