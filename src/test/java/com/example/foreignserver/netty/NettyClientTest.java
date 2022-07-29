package com.example.foreignserver.netty;

import com.example.foreignserver.netty.model.CommentResponse;
import com.example.foreignserver.netty.model.PostResponse;
import com.example.foreignserver.netty.model.UserResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootTest
class NettyClientTest {

    @Autowired
    NettyClient nettyClient;

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void 유저_클라이언트() {
        List<UserResponse> userResponses = nettyClient.userClient();


        System.out.println("result = " + userResponses.size());
    }

    @Test
    void 포스트_클라이언트() {
        Object[] objects = nettyClient.postClient();
        System.out.println("objects = " + Arrays.toString(objects));
        Assertions.assertThat(objects).hasSize(10);

        List<PostResponse> postResponses = Arrays.stream(objects)
                .map(o -> objectMapper.convertValue(o, PostResponse.class))
                .toList();

        System.out.println("postResponses = " + postResponses);
    }

    @Test
    void commentPostTest() {
        nettyClient.commentPost();
//        System.out.println("objects = " + objectMapper.convertValue(obj[0], CommentResponse.class));
        System.out.println("objects = " + nettyClient.commentPost());
    }

    @Test
    void gasdf() {

        ResponseEntity<Void> obj = nettyClient.userRegister();

        Assertions.assertThat(obj.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    void 포스트_클라이언트_등록() {
        Object[] objects = nettyClient.postClient();
        nettyClient.postClientRegister();


    }
}