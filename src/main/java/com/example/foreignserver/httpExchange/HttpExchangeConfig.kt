package com.example.foreignserver.httpExchange

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.support.WebClientAdapter

import org.springframework.web.service.invoker.HttpServiceProxyFactory




@Configuration
open class HttpExchangeConfig {

    @Bean
    open fun gitHubClient(): HttpExchangeApiCall? {
        return HttpServiceProxyFactory.builder(WebClientAdapter.forClient(WebClient.builder().build()))
            .build()
            .createClient(HttpExchangeApiCall::class.java)
    }
}