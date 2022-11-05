package com.amer.pss.persistence.repository;

import com.amer.pss.persistence.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post,Long> {
}
