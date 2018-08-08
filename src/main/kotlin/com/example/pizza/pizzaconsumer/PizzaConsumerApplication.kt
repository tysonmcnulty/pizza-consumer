package com.example.pizza.pizzaconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PizzaConsumerApplication

fun main(args: Array<String>) {
    runApplication<PizzaConsumerApplication>(*args)
}
