package com.example.foreignserver.restApi;

import com.example.foreignserver.netty.model.PostResponse;
import com.example.foreignserver.netty.model.UserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;


@SpringBootTest
class RestClientTest {

    @Autowired
    RestClient restClient;

    @Test
    void getForObject(){
        UserResponse[] o = restClient.getForObject();
        System.out.println("o = " + o.toString());
    }
    @Test
    void getForEntity(){
        ResponseEntity<UserResponse[]> o = restClient.getForEntity();
        System.out.println("o = " + o.toString());
    }
    @Test
    void getForUri(){
        ResponseEntity<PostResponse[]> o = restClient.getForUri();
        System.out.println("o = " + o.toString());
    }

}