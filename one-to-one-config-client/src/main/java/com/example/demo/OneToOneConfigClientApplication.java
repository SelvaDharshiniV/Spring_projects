package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.ifaces.CompanyRepositior;


@SpringBootApplication
public class OneToOneConfigClientApplication {

	@Value("${custom.message}")
	private String message;
	public static void main(String[] args) {
		SpringApplication.run(OneToOneConfigClientApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Autowired
			CompanyRepositior repo;
			
			@Override
			public void run(String... args)throws Exception{
				System.out.println(repo.findAll());
				System.out.println(message);
			}
		};
	}
}
