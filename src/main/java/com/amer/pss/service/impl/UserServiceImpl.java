package com.amer.pss.service.impl;


import com.amer.pss.persistence.model.Users;
import com.amer.pss.persistence.repository.UserRepository;
import com.amer.pss.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<Users> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Users save(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Iterable<Users> findAll() {
        return userRepository.findAll();
    }
}
