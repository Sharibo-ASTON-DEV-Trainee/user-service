package com.gmail.alexejkrawez.repository;

import com.gmail.alexejkrawez.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByTelegramUserId(Long userId);
}
