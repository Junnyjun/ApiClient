package com.example.foreignserver.unirest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UnirestCallTest{

    @Test
    fun getApiCall() {
        val unirestCall = UnirestCall()
        val response = unirestCall.getApiCall()
        println(response)
    }
}