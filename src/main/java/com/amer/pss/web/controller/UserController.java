package com.amer.pss.web.controller;

import com.amer.pss.persistence.model.Post;
import com.amer.pss.persistence.model.Users;
import com.amer.pss.service.UserService;
import com.amer.pss.web.dto.PostsDto;
import com.amer.pss.web.dto.UsersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
    @RequestMapping("/public/v2/users")
public class UserController {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @RequestMapping
    public Collection<UsersDto> findAll(){

        List<UsersDto> usersDtoList = new ArrayList<>();
       this.userService.findAll().forEach(user -> {
           usersDtoList.add(convertToUsersDto(user));
       });

       return  usersDtoList;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Users user) {

        this.userService.save(new Users(user.getId(), user.getName(),user.getEmail(), user.getGender(),
                user.getStatus(),user.getUsername(),bCryptPasswordEncoder.encode(user.getPassword())));
    }

    @GetMapping
    @RequestMapping("/{id}")
    public UsersDto findOne(@PathVariable Long id){
        return convertToUsersDto(userService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    protected UsersDto convertToUsersDto(Users users){
        return new UsersDto(users.getId(), users.getName(), users.getEmail(),users.getGender(), users.getStatus());
    }
}
