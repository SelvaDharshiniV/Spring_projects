package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.model.Branch;
import com.example.demo.model.LoanEntity;
import com.example.demo.repos.BranchRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition( info = @Info(title = "Loan Service",version="1.0"))
public class SpringRestServicesExerciseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringRestServicesExerciseApplication.class, args);
//		BranchRepository repo=ctx.getBean(BranchRepository.class);
//		Branch ram = ctx.getBean(Branch.class);
//		ram.setBranchCode(102);
//		ram.setBranchManager("kum");
//		ram.setLoanList(loanList);
//		Customer added=repo.save(ram);
	}

//	@Bean
//	public BCryptPasswordEncoder encoder() {
//		return new BCryptPasswordEncoder();
//	}
	@Bean
	public LoanEntity comp1() {
		return new LoanEntity(101, "Kumar", LocalDate.now(), 55000, "Personal Loan");
		
	}
	@Bean
	public LoanEntity comp2() {
		return new LoanEntity(101, "Raj", LocalDate.now(), 450000, "Car Loan");
		
	}
}
