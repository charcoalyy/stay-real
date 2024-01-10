package com.stayreal.backend.model;

import jakarta.persistence.Entity;

@Entity
public class User {
    private Long id;
    private String username;
    private String email;

    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
}
