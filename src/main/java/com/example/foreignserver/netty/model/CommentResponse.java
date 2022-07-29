package com.example.foreignserver.netty.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@Getter
@Setter
@JsonAutoDetect(getterVisibility = ANY)
@NoArgsConstructor
public class CommentResponse {
    private Long id;
    @JsonProperty("post_id")
    private Long postId;
    private String name;
    private String email;
    private String body;

    @Builder
    public CommentResponse(Long id,Long postId,String name,String email,String body) {
        this.id = id;
        this.postId = postId;
        this.name = name;
        this.email = email;
        this.body = body;
    }
}
