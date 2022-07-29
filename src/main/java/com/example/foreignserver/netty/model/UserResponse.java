package com.example.foreignserver.netty.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;


@Getter
@Setter
@JsonAutoDetect(getterVisibility = ANY)
@NoArgsConstructor
public class UserResponse {
    private String id;
    private String name;
    private String email;
    private String gender;
    private String status;

    @Builder
    public UserResponse(String id, String name, String email, String gender, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.status = status;
    }
}
