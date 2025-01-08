package com.example.musiclibrary.controller;


import com.example.musiclibrary.model.UserEntity;
import com.example.musiclibrary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }

    @GetMapping("/{userId}")
    public UserEntity getUser(@PathVariable String userId) {
        return userService.getUserById(userId);
    }
}
