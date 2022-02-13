package com.example.login.jwtlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class JwtloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtloginApplication.class, args);
	}

}
