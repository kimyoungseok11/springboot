package com.example.login.logintest;

import com.sun.org.apache.xerces.internal.parsers.SecurityConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import javax.persistence.ExcludeDefaultListeners;
import javax.persistence.SecondaryTables;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LogintestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogintestApplication.class, args);
	}

}
