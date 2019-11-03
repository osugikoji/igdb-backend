package br.com.igdb.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {

    companion object {
        private val PUBLIC_MATCHERS = arrayOf("/")
    }

    override fun configure(http: HttpSecurity?) {
        http?.cors()?.and()?.csrf()?.disable()
        http?.authorizeRequests()
                ?.antMatchers(*PUBLIC_MATCHERS)?.permitAll()
    }
}