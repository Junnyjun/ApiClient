package com.example.foreignserver.openFeign

import com.example.foreignserver.netty.model.UserResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "getApiCall", url = "https://gorest.co.in/public/v2/users")
interface GetApicall {

    @GetMapping
    fun getApiCall(): List<UserResponse>

}