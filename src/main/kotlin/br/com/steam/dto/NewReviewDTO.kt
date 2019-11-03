package br.com.steam.dto

import org.hibernate.validator.constraints.Length
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class NewReviewDTO(
        @field:NotNull(message = "Preenchimento obrigatório")
        val recommendationId: Int? = null,

        @field:NotEmpty(message = "Preenchimento obrigatório")
        @field:NotNull(message = "Preenchimento obrigatório")
        @field:Length(min = 1, max = 256, message = "O tamanho deve ser entre 1 e 256 caracteres")
        val review: String? = null
)