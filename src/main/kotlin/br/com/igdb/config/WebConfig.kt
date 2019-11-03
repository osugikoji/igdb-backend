package br.com.igdb.config

import br.com.igdb.utility.ConstHttp
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@EnableWebMvc
class WebConfig : WebMvcConfigurer {

    /**
     * Configuração do cors. Libera o acesso de todos os endpoints pra múltiplas fontes.
     */
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
                .allowedMethods(ConstHttp.GET, ConstHttp.POST, ConstHttp.PUT, ConstHttp.DELETE, ConstHttp.OPTIONS,
                        ConstHttp.HEAD, ConstHttp.TRACE, ConstHttp.CONNECT)
    }
}