package com.amer.pss.service;

import com.amer.pss.persistence.model.Post;
import com.amer.pss.persistence.model.Users;

import java.util.Optional;

public interface PostService {

    Optional<Post> findById(Long id);

    Post save(Post post);

    Iterable<Post> findAll();
}
