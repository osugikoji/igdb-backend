package br.com.steam.documents

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.util.*

@Document("steam_reviews")
data class GameReview(
        @Id
        val id: String? = null,
        @Field("date_posted")
        @JsonFormat(pattern = "dd/MM/yyyy")
        val datePosted: Date?,
        val negative: Long?,
        val positive: Long?,
        @Field("hour_played")
        val hourPlayed: Long?,
        @Field("is_early_access_review")
        val isEarlyAccessReview: Boolean,
        val recommendation: String?,
        val review: String?,
        @Field("title")
        val gameTitle: String?
)