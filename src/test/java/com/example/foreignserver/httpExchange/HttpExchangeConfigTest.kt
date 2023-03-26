package com.example.foreignserver.httpExchange

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class HttpExchangeConfigTest {

    @Autowired
    lateinit var httpExchangeApiCall: HttpExchangeApiCall

    @Test
    fun getApiCall() {
        val response = httpExchangeApiCall.getApiCall()
        println(response)
    }
}