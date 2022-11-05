package com.amer.pss.service.impl;

import com.amer.pss.persistence.model.Post;
import com.amer.pss.persistence.model.Users;
import com.amer.pss.persistence.repository.PostRepository;
import com.amer.pss.service.PostService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    private  final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }
}
