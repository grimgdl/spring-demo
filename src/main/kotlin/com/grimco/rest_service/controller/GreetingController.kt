package com.grimco.rest_service.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {

        val counter = AtomicLong()

        return Greeting(counter.incrementAndGet(), "Hello $name")
    }

}


data class Greeting(val id: Long, val content: String)