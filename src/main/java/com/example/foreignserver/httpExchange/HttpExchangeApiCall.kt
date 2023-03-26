package com.example.foreignserver.httpExchange

import org.springframework.web.service.annotation.GetExchange

interface HttpExchangeApiCall {

    @GetExchange("https://gorest.co.in/public/v2/users")
    fun getApiCall(): String
}