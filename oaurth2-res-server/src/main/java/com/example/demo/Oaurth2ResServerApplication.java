package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class Oaurth2ResServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oaurth2ResServerApplication.class, args);
	}

}
