package com.amer.pss.web.controller;

import com.amer.pss.persistence.model.Post;
import com.amer.pss.service.PostService;
import com.amer.pss.web.dto.PostsDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/public/v2/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public Collection<PostsDto> findAll(){

        List<PostsDto> postsDto = new ArrayList<>();
         this.postService.findAll().forEach(post -> {
            postsDto.add(convertToPostDto(post));
        });

         return postsDto;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Post post) {
        this.postService.save(post);
    }

    @GetMapping
    @RequestMapping("/{id}")
    public PostsDto findOne(@PathVariable Long id){
        return convertToPostDto(postService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    protected PostsDto convertToPostDto(Post post){
        return new PostsDto(post.getId(),post.getTitle(),post.getBody(),post.getUsers());
    }
}
