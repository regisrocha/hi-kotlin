package dev.rrlabs.hikotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HiKotlinApplication

fun main(args: Array<String>) {
	runApplication<HiKotlinApplication>(*args)
}
