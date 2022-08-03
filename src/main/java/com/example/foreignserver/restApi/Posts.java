package com.example.foreignserver.restApi;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class Posts {
    private Long userId;
    private Long id;
    private String title;
    private String body;

    private Posts(Long userId, Long id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public static Posts of(Long userId, Long id, String title, String body) {
        return new Posts(userId, id, title, body);
    }
}
