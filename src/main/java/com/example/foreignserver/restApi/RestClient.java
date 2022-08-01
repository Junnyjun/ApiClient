package com.example.foreignserver.restApi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class RestClient {

    private final RestTemplate restTemplate;

    public void get(){

    }


}
