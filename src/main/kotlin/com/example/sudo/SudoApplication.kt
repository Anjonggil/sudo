package com.example.sudo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SudoApplication

fun main(args: Array<String>) {
	runApplication<SudoApplication>(*args)
}
