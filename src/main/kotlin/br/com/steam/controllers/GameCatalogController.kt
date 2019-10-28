package br.com.steam.controllers

import br.com.steam.dto.GameCatalogDTO
import br.com.steam.dto.GameDTO
import br.com.steam.dto.GameReviewDTO
import br.com.steam.dto.GameReviewSearchDTO
import br.com.steam.services.interfaces.GameService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/games")
class GameCatalogController constructor(
        private val gameService: GameService
) {

    @GetMapping("/catalog")
    fun getAllGameCatalog(): ResponseEntity<List<GameCatalogDTO>> {
        return ResponseEntity.ok(gameService.getAllGameCatalog())
    }

    @PostMapping("/reviews")
    fun getAllGameReview(@RequestBody gameReviewSearchDTO: GameReviewSearchDTO): ResponseEntity<List<GameReviewDTO>> {
        return ResponseEntity.ok(gameService.getAllGameReview(gameReviewSearchDTO))
    }

    @GetMapping("/search")
    fun getGames(@RequestParam(value = "key") key: Int,
                 @RequestParam(value = "value") value: String,
                 @RequestParam(value = "size") size: Int,
                 @RequestParam(value = "page") page: Int): ResponseEntity<List<GameDTO>> {
        return ResponseEntity.ok(gameService.getGames(key, value, size, page))
    }
}