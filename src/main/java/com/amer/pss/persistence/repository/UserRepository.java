package com.amer.pss.persistence.repository;

import com.amer.pss.persistence.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users,Long> {
    Users findByUsername(String username);
}
