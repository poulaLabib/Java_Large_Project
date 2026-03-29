package com.example.service;

import com.example.model.User;

public class AuthenticationService {
    private final UserService userService;

    public AuthenticationService(UserService userService) {
        this.userService = userService;
    }

    public boolean authenticate(String username, String password) {
        User user = userService.getUserByUsername(username);
        return user.getPassword().equals(password);
    }

    public String generateToken(String username) {
        return "TOKEN-" + username + "-" + System.currentTimeMillis();
    }

    public boolean validateToken(String token) {
        return token != null && token.startsWith("TOKEN-");
    }
}
