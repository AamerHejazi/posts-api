package com.amer.pss.persistence.repository;

import com.amer.pss.persistence.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
