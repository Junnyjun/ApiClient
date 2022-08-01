package com.example.foreignserver.netty;

import com.example.foreignserver.netty.model.CommentResponse;
import com.example.foreignserver.netty.model.PostResponse;
import com.example.foreignserver.netty.model.UserResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

@Component
@RequiredArgsConstructor
public class NettyClient {

    private final WebClientConfig client;
    private final ObjectMapper objectMapper;

    @Value("${default.path}")
    private String URL;

    @Value("${default.token}")
    private String token;
    // #TODO : Authorization : USER_TOKEN <<-
    public List<UserResponse> userClient() {
        String url = URL + "/public/v2/users";

        return client.webClient()
                .get()
                .uri(url)
                .acceptCharset(UTF_8)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<UserResponse>>(){})
                .block();
    }

    public Object[] postClient() {
        String url = "https://gorest.co.in/public/v2/posts";
        return client.webClient()
                .get()
                .uri(url)
                .acceptCharset(UTF_8)
                .retrieve()
                .bodyToMono(Object[].class)
                .block();
    }

    public ResponseEntity<Void> commentPost() {
        String url = "https://gorest.co.in/public/v2/posts/59/comments";

        CommentResponse commentResponse = CommentResponse.builder()
                .id(123L)
                .postId(123L)
                .name("asd")
                .email("kang@asdf.com")
                .body("commentTestBody")
                .build();

        return client.webClient()
                .post()
                .uri(url)
                .header("Authorization",token)
                .bodyValue(commentResponse)
                .acceptCharset(UTF_8)
                .retrieve()
                .toBodilessEntity()
                .block();
    }

    public ResponseEntity<Void> userRegister() {
        String url = "https://gorest.co.in/public/v2/users?access-token=xxx";

        UserResponse build = UserResponse.builder()
                .id("123")
                .email("123")
                .gender("123")
                .name("123")
                .status("123")
                .build();

        return client.webClient()
                .post()
                .uri(url)
                .bodyValue(build)
                .acceptCharset(UTF_8)
                .retrieve()
                .toBodilessEntity()
                .block();
    }

}
