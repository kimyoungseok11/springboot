package com.example.login.logintest.controller;

import com.example.login.logintest.domain.User;
import com.example.login.logintest.dto.UserForm;
import com.example.login.logintest.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
@ResponseBody
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public void signUpUser(@RequestBody UserForm userForm){
        userService.SignUpUser(userForm);
    }

    @GetMapping("/info")
    public Object projectInfo(){

        return userService.getUsers();
    }
}
