package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Ex11Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(Ex11Application.class, args);

		System.out.println(ctx.getBean("invoice1"));
		System.out.println(ctx.getBean("invoice2"));
	}

}
