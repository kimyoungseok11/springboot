package com.example.login.logintest.domain;

import com.example.login.logintest.dto.UserForm;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private LocalDate regDate;

    public User(UserForm userForm){
        this.email = userForm.getEmail();
        this.password = userForm.getPassword();
        this.regDate = LocalDate.now();
    }

    public static User createUser(UserForm userForm){
        return new User(userForm);
    }
}
