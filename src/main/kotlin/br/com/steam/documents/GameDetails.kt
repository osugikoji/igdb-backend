package br.com.steam.documents

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.math.BigDecimal
import java.util.*

@Document("steam")
data class GameDetails(
        @Field("appid")
        val id: String,
        val name: String?,
        @Field("release_date")
        @JsonFormat(pattern = "dd/MM/yyyy")
        val releaseDate: Date?,
        @Field("english")
        val hasEnglishSupport: Boolean?,
        val developer: String?,
        val publisher: String?,
        val platforms: String?,
        @Field("required_age")
        val requiredAge: Int?,
        val categories: String?,
        val genres: String?,
        @Field("steam_spy_tags")
        val steamSpyTags: String?,
        val achievements: Int?,
        @Field("positive_ratings")
        val positiveRatings: Int?,
        @Field("negative_ratings")
        val negativeRatings: Int?,
        @Field("average_playtime")
        val averagePlayTime: Int?,
        @Field("median_playtime")
        val medianPlayTime: Int?,
        @Field("owners")
        val owners: String?,
        val price: BigDecimal?
)