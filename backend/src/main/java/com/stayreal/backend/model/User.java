package com.stayreal.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "app_user")
public class User {
    @Id
    private Long id;
    private String username;
    private String email;

    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
}
