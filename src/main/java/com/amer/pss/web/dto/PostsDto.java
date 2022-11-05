package com.amer.pss.web.dto;

import com.amer.pss.persistence.model.Users;
import org.h2.engine.User;

public class PostsDto {
    private final Long id;
    private final Long user_id;
    private final String title;
    private final String body;


    public PostsDto(Long id, String title, String body,Users users) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.user_id = users.getId();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Long getUser_id() {
        return user_id;
    }
}
