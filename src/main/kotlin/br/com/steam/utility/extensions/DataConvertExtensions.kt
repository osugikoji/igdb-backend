package br.com.steam.utility.extensions

import br.com.steam.documents.GameReview
import br.com.steam.dto.GameReviewDTO

fun GameReview.getDTO(): GameReviewDTO =
        GameReviewDTO(
                this.datePosted?.parseToDate(),
                this.negative,
                this.positive,
                this.hourPlayed,
                this.recommendation,
                this.review)
