package com.example.foreignserver.okhttp

import okhttp3.OkHttpClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class OkhttpConfig {

    @Bean
    open fun okhttpClient(): OkHttpClient = OkHttpClient()
}