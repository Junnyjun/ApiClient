package com.example.foreignserver.netty.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class PostResponse {
    private Long id;
    @JsonProperty("user_id")
    private String userId;
    private String title;
    private String body;


}
