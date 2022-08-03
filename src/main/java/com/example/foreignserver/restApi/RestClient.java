package com.example.foreignserver.restApi;

import com.example.foreignserver.netty.model.PostResponse;
import com.example.foreignserver.netty.model.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

import static com.example.foreignserver.restApi.Posts.of;
import static java.util.Map.of;

@Component
@RequiredArgsConstructor
public class RestClient {
    private final RestTemplate restTemplate;
    @Value("${default.path}")
    private String URL;

    public UserResponse[] getForObject(){
        return restTemplate.getForObject(URL + "/public/v2/users", UserResponse[].class);
    }
    public ResponseEntity<UserResponse[]> getForEntity(){
        return restTemplate.getForEntity(URL + "/public/v2/users", UserResponse[].class);
    }

    public ResponseEntity<PostResponse[]> getForUri(){
        URI uri = UriComponentsBuilder
                .fromHttpUrl(URL + "/public/v2/users/{id}/todos")
                .build(of("id", 25));
        return restTemplate.getForEntity(uri, PostResponse[].class);
    }

    public ResponseEntity<Posts> postEntity(){
        return restTemplate.postForEntity("https://jsonplaceholder.typicode.com/posts",
                of(1234L,1234L,"title","body"),
                Posts.class);
    }
    public Posts postObject(){
        return restTemplate.postForObject("https://jsonplaceholder.typicode.com/posts",
                of(1234L,1234L,"title","body"),
                Posts.class);
    }

    public ResponseEntity<Posts> post(){
        return restTemplate.postForEntity("https://jsonplaceholder.typicode.com/posts",
                of(1234L,1234L,"title","body"),
                Posts.class);
    }
    public URI postLocation(){
        return restTemplate.postForLocation("https://jsonplaceholder.typicode.com/posts",
                of(1234L,1234L,"title","body"));
    }

    public void delete(){
        restTemplate.delete(URL + "/public/v2/users");
    }

    public void put(){
        restTemplate.put("https://jsonplaceholder.typicode.com/posts/1",
                of(1234L,1234L,"title","body"));
    }
}
