package com.board.boardtest.domain;

import com.board.boardtest.dto.UserForm;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickName;

    @Column(nullable = false)
    private String userRegdate;

    public User(UserForm userForm){
        this.username = userForm.getUserName();
        this.password = userForm.getPassword();
        this.nickName = userForm.getNickName();
        this.userRegdate = userForm.getUserRegdate();
    }

    public static User createUser(UserForm userForm){
        return new User(userForm);
    }
}
