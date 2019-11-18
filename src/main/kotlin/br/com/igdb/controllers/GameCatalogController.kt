package br.com.igdb.controllers

import br.com.igdb.dto.*
import br.com.igdb.services.interfaces.GameService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/games")
class GameCatalogController constructor(
        private val gameService: GameService
) {

    @GetMapping("/catalog")
    fun getAllGameCatalog(): ResponseEntity<List<GameCatalogDTO>> {
        return ResponseEntity.ok(gameService.getAllGameCatalog())
    }

    @GetMapping("/catalog/publishers")
    fun getAllPublishersCatalog(): ResponseEntity<List<GameCatalogDTO>> {
        return ResponseEntity.ok(gameService.getAllPublisherCatalog())
    }

    @GetMapping("/catalog/developers")
    fun getAllDeveloperCatalog(): ResponseEntity<List<GameCatalogDTO>> {
        return ResponseEntity.ok(gameService.getAllDeveloperCatalog())
    }

    @PostMapping("/reviews")
    fun getAllGameReview(@RequestBody gameReviewSearchDTO: GameReviewSearchDTO): ResponseEntity<List<GameReviewDTO>> {
        return ResponseEntity.ok(gameService.getAllGameReview(gameReviewSearchDTO))
    }

    @GetMapping("/reviews/{gameName}/number")
    fun getReviewsNumber(@PathVariable gameName: String): ResponseEntity<Long> {
        return ResponseEntity.ok(gameService.getReviewsNumber(gameName))
    }

    @PostMapping("/reviews/{gameName}")
    fun insertGameReview(@PathVariable gameName: String,
                         @Valid @RequestBody newReviewDTO: NewReviewDTO): ResponseEntity<GameReviewDTO> {
        return ResponseEntity.ok(gameService.insertReview(gameName, newReviewDTO))
    }

    @GetMapping("/search/{key}")
    fun searchGames(@PathVariable key: String,
                    @RequestParam(value = "value") value: String,
                    @RequestParam(value = "size") size: Int,
                    @RequestParam(value = "page") page: Int): ResponseEntity<List<GameDTO>> {
        return ResponseEntity.ok(gameService.getGames(key, value, size, page))
    }

    @GetMapping("/search")
    fun searchGames(@RequestParam(value = "value") value: String,
                    @RequestParam(value = "size") size: Int,
                    @RequestParam(value = "page") page: Int): ResponseEntity<List<GameDTO>> {
        return ResponseEntity.ok(gameService.getGames(value, size, page))
    }
}