package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.demo.service.DoctorService;

@SpringBootApplication
public class SpringJpaEgApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringJpaEgApplication.class, args);
		DoctorService service=ctx.getBean(DoctorService.class);
		System.out.println(service);
		service.findAll().forEach(System.out::println);
		
	}

}
