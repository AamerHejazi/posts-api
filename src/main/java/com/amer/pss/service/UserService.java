package com.amer.pss.service;

import com.amer.pss.persistence.model.Users;

import java.util.Optional;

public interface UserService {
    Optional<Users> findById(Long id);

    Users save(Users user);

    Iterable<Users> findAll();
}
