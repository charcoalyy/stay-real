package com.stayreal.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stayreal.backend.model.User;
import com.stayreal.backend.service.UserService;


@RestController
public class TestController {

    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<String> user(User user) {
        try {
            return ResponseEntity.ok(userService.getUsername(user));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
        }
    }
}
