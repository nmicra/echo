package com.example.nmicra

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class EchoController(@Value("\${echo.text}")
                     val echoText: String) {


    @GetMapping("/echo")
    suspend fun echo() : String = "$echoText -> ${LocalDateTime.now()}"
}