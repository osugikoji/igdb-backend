package br.com.igdb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IgdbApplication

fun main(args: Array<String>) {
    runApplication<IgdbApplication>(*args)
}
