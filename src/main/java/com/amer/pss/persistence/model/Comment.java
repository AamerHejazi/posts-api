package com.amer.pss.persistence.model;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String body;

    @JoinColumn(name = "post_id", updatable = false)
    @ManyToOne(targetEntity = Post.class, fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Post post;

    public Comment() {
    }

    public Comment(Long id, String name, String email, String body, Post post) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
        this.post = post;
    }

    public Long getId() {
        return id;
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

    public Post getPost() {
        return post;
    }
}
