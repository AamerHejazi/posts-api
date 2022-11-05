package com.amer.pss.service.impl;

import com.amer.pss.persistence.model.Comment;
import com.amer.pss.persistence.repository.CommentRepository;
import com.amer.pss.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {

    private  final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Iterable<Comment> findAll() {
        return commentRepository.findAll();
    }
}
