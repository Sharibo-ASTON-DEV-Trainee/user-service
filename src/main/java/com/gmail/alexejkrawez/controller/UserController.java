package com.gmail.alexejkrawez.controller;

import com.gmail.alexejkrawez.dto.UserDto;
import com.gmail.alexejkrawez.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long userId) {
        UserDto userById = userService.getUserById(userId);
        return ResponseEntity.ok(userById);
    }

    @PostMapping("/{userId}")
    public ResponseEntity<UserDto> createUser(@PathVariable Long userId) {
        UserDto userById = userService.saveUserWithId(userId);
        return ResponseEntity.ok(userById);
    }
}
