package com.gmail.alexejkrawez.service.impl;

import com.gmail.alexejkrawez.dto.UserDto;
import com.gmail.alexejkrawez.entity.User;
import com.gmail.alexejkrawez.mapper.UserMapper;
import com.gmail.alexejkrawez.repository.UserRepository;
import com.gmail.alexejkrawez.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto getUserById(Long userId) {
        return userMapper.toUserDto(userRepository.findByTelegramUserId(userId)
                .orElseThrow(EntityNotFoundException::new));
    }

    @Override
    @Transactional
    public UserDto saveUserWithId(Long userId) {

        return Optional.of(User.builder()
                        .telegramUserId(userId)
                        .build())
                .map(userRepository::saveAndFlush)
                .map(userMapper::toUserDto)
                .orElseThrow();
    }
}