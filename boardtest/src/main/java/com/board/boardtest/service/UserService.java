package com.board.boardtest.service;

import com.board.boardtest.domain.User;
import com.board.boardtest.dto.UserForm;
import com.board.boardtest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void signUpUser(UserForm userForm) {
        userRepository.save(User.createUser(userForm));
    }
}
