package com.amer.pss.web.controller;

import com.amer.pss.persistence.model.Comment;
import com.amer.pss.persistence.model.Post;
import com.amer.pss.service.CommentService;
import com.amer.pss.service.PostService;
import com.amer.pss.web.dto.CommentDto;
import com.amer.pss.web.dto.PostsDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/public/v2/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public Collection<CommentDto> findAll(){
        List<CommentDto> commentDtoList = new ArrayList<>();
        this.commentService.findAll().forEach(post -> {
            commentDtoList.add(convertToCommentDto(post));
        });
        return commentDtoList;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Comment comment) {
        this.commentService.save(comment);
    }

    @GetMapping
    @RequestMapping("/{id}")
    public CommentDto findOne(@PathVariable Long id){
        return convertToCommentDto(commentService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    protected CommentDto convertToCommentDto(Comment comment){
        return new CommentDto(comment.getId(),comment.getName(),comment.getEmail(),comment.getBody(),comment.getPost());
    }
}
