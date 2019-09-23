package br.com.steam.services.interfaces

import br.com.steam.dto.GameCatalogDTO

interface GameService {

    fun getAllGameCatalog(): List<GameCatalogDTO>

}