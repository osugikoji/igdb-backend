package br.com.igdb.utility.extensions

import br.com.igdb.documents.GameReview
import br.com.igdb.dto.GameReviewDTO

fun GameReview.getDTO(): GameReviewDTO =
        GameReviewDTO(
                this.datePosted?.parseToDate(),
                this.negative,
                this.positive,
                this.hourPlayed,
                this.recommendation,
                this.review,
                this.userName,
                this.avatarId)
