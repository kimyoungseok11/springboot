package com.example.login.logintest.service;

import com.example.login.logintest.domain.User;
import com.example.login.logintest.dto.UserForm;
import com.example.login.logintest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void SignUpUser(UserForm userForm){
        userRepository.save(User.createUser(userForm));
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
