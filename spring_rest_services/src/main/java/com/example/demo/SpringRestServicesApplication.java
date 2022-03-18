package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.model.Student;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition( info = @Info(title = "Student Service",version="1.0"))

public class SpringRestServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestServicesApplication.class, args);
		
	}
	@Bean
	public Student ram() {
		return new Student(101,"Ram",95);
	}
	@Bean
	public Student shyam() {
		return new Student(102,"Shyam",94);
	}
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
}
