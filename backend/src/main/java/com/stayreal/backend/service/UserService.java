package com.stayreal.backend.service;

import java.util.Optional;

import com.stayreal.backend.model.User;
import com.stayreal.backend.repository.UserRepository;

public class UserService {
    UserRepository userRepository;

    public String getUsername(User user) throws Exception {
        Optional<User> foundUser = userRepository.findById(user.getId());
        if (foundUser.isPresent()) {
            return foundUser.get().getUsername();
        } else {
            throw new Exception("User not found");
        }
    }
}
