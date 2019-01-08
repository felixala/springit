package com.felix.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felix.springit.domain.Link;

public interface LinkRepository extends JpaRepository<Link, Long>{

}
