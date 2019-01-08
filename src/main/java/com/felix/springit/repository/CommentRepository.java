package com.felix.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felix.springit.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
