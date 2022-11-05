package com.amer.pss.persistence.model;

import javax.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String body;

    @JoinColumn(name = "user_id",updatable = false)
    @ManyToOne(targetEntity = Users.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Users user;

    public Post() {
    }

    public Post(Long id, String title, String body, Users user) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.user = user;
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

    public Users getUsers() {
        return user;
    }
}
