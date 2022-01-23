package com.board.test.demo.repository;

import com.board.test.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existByEmail(String email);
}
