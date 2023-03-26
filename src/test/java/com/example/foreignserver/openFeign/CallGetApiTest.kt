package com.example.foreignserver.openFeign

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CallGetApiTest {

    @Autowired
    lateinit var getApicall: GetApicall

    @Test
    fun adsf(){
        val response = getApicall.getApiCall()
        println(response)
    }
}