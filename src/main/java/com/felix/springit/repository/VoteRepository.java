package com.felix.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felix.springit.domain.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

}
