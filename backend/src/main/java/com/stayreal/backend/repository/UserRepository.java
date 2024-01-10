package com.stayreal.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stayreal.backend.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
