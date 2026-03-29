package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import com.example.dto.UserDto;
import java.util.List;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User getUser(Long id) {
        return userService.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public User createUser(UserDto dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        return userService.createUser(user);
    }

    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }
}
