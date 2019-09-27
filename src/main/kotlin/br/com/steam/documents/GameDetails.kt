package br.com.steam.documents

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.math.BigDecimal
import java.util.*

@Document("steam")
data class GameDetails(
        @Field("appid")
        val id: String? = null,
        val name: String? = null,
        @Field("release_date")
        @JsonFormat(pattern = "dd/MM/yyyy")
        val releaseDate: Date? = null,
        @Field("english")
        val hasEnglishSupport: Boolean? = null,
        val developer: String? = null,
        val publisher: String? = null,
        val platforms: String? = null,
        @Field("required_age")
        val requiredAge: Int? = null,
        val categories: String? = null,
        val genres: String? = null,
        @Field("steam_spy_tags")
        val steamSpyTags: String? = null,
        val achievements: Int? = null,
        @Field("positive_ratings")
        val positiveRatings: Int? = null,
        @Field("negative_ratings")
        val negativeRatings: Int? = null,
        @Field("average_playtime")
        val averagePlayTime: Int? = null,
        @Field("median_playtime")
        val medianPlayTime: Int? = null,
        @Field("owners")
        val owners: String? = null,
        val price: BigDecimal? = null
)