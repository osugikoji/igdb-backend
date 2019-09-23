package br.com.steam.controllers

import br.com.steam.dto.GameCatalogDTO
import br.com.steam.services.interfaces.GameService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/games")
class GameCatalogController constructor(
        private val gameService: GameService
) {

    @GetMapping("/catalog")
    fun getAllGameCatalog(): ResponseEntity<List<GameCatalogDTO>> {
        return ResponseEntity.ok(gameService.getAllGameCatalog())
    }
}