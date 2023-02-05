package com.gmail.alexejkrawez.controller;

import com.gmail.alexejkrawez.entity.User;
import com.gmail.alexejkrawez.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<User> checkUser(@PathVariable UUID userId) {
        User userById = userService.getUserById(userId);
        return ResponseEntity.ok(userById);
    }
}
