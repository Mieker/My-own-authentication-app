package com.mieker.authentic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AuthenticApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticApplication.class, args);
	}

	@Bean
    public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
}


