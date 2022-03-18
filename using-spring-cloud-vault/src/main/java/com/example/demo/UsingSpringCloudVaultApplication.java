package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.repos.StudentRepository;

@SpringBootApplication
public class UsingSpringCloudVaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsingSpringCloudVaultApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Autowired
			private StudentRepository repo;
			@Override
			public void run(String... args) throws Exception {
				System.out.println(repo.findAll());			}
		};
	}
}
