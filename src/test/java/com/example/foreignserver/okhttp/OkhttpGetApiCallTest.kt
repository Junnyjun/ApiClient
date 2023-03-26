package com.example.foreignserver.okhttp

import okhttp3.OkHttpClient
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OkhttpGetApiCallTest {

    @Test
    fun getApiCall() {
        val okhttpGetApiCall = OkhttpGetApiCall(OkHttpClient())
        val response = okhttpGetApiCall.getApiCall()
        println(response)
    }
}