package com.board.boardtest.controller;

import com.board.boardtest.dto.UserForm;
import com.board.boardtest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@ResponseBody
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public void signUpUser(@RequestBody UserForm userForm){
        userService.signUpUser(userForm);
    }
}
