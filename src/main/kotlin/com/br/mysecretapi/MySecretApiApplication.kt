package com.br.mysecretapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MySecretApiApplication

fun main(args: Array<String>) {
	runApplication<MySecretApiApplication>(*args)
}
