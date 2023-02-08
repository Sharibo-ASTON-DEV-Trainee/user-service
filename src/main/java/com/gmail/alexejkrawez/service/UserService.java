package com.gmail.alexejkrawez.service;

import com.gmail.alexejkrawez.dto.UserDto;
import com.gmail.alexejkrawez.entity.User;

public interface UserService {

    UserDto getUserById(Long id);

    UserDto saveUserWithId(Long id);
}