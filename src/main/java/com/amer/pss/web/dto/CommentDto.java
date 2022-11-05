package com.amer.pss.web.dto;


import com.amer.pss.persistence.model.Post;

public class CommentDto {

    private final Long id;
    private final Long post_id;
    private final String name;
    private final String email;
    private final String body;

    public CommentDto(Long id, String name, String email, String body, Post post) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
        this.post_id = post.getId();
    }

    public Long getId() {
        return id;
    }

    public Long getPost_id() {
        return post_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }
}
