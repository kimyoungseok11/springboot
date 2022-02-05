package com.example.login.jwtlogin.service;

import com.example.login.jwtlogin.domain.User;
import com.example.login.jwtlogin.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElseThrow(IllegalAccessError::new);
    }

    public User registerUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    @Transactional
    public User updateUser(Long id, User user){
        User userData = userRepository.findById(id).orElseThrow(IllegalAccessError::new);
        userData.update(userData.getPassword(),userData.getName());
        return userData;
    }
}
