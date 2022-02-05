package com.example.login.jwtlogin.repository;

import com.example.login.jwtlogin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
