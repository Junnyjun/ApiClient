package com.example.foreignserver.unirest

import kong.unirest.GetRequest
import kong.unirest.Unirest

class UnirestCall {

    fun getApiCall(): String {
        return Unirest.get("https://gorest.co.in/public/v2/users")
            .asString()
            .body
    }
}