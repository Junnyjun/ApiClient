package com.example.foreignserver.okhttp

import okhttp3.OkHttpClient
import org.springframework.stereotype.Component

@Component
class OkhttpGetApiCall(
    private final val okhttpClient: OkHttpClient
) {

    fun getApiCall(): String {
        val request = okhttp3.Request.Builder()
            .url("https://gorest.co.in/public/v2/users")
            .build()
        val response = okhttpClient.newCall(request).execute().peekBody(Long.MAX_VALUE)

        return response.string()
    }
}