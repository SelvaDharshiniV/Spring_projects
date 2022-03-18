package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Employee;

@SpringBootApplication
public class AssessmentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(AssessmentApplication.class, args);
	}
//	@Bean
//	public Employee comp1() {
//		return new Employee(212, "selva", "safasf", 436345, "asfasf", "sdgds", 32543, LocalDate.now(), LocalDate.now(), LocalDate.now(), "asfdgf", LocalDate.now(), "asdgsdgfsd");
//		
//	}
}
