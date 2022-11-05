package com.amer.pss.service;

import com.amer.pss.persistence.model.Comment;
import com.amer.pss.persistence.model.Post;

import java.util.Optional;

public interface CommentService {

    Optional<Comment> findById(Long id);

    Comment save(Comment comment);

    Iterable<Comment> findAll();
}
