package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.training.eg1.Testing2;
import org.training.model.Professor;

import com.example.demo.model.Student;
import com.training.eg.Testing;

import excella.project.assignment.College;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.model","org.training.model"})
//@ComponentScan(basePackages = {"org.training.eg1","com.training.eg"})
public class UnderstandingComponentScanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(UnderstandingComponentScanApplication.class, args);
//		System.out.println("Student: "+ctx.getBean(Student.class));
//		System.out.println("Professor: "+ctx.getBean(Professor.class));
//		System.out.println("Testing: "+ctx.getBean(Testing.class));
//		System.out.println("Testing2: "+ctx.getBean(Testing2.class));
		System.out.println("Testing: "+ctx.getBean("ram"));
//		System.out.println("Testing2: "+ctx.getBean("shyam"));
		System.out.println("Professor: "+ctx.getBean("shyam",Professor.class));
//		System.out.println(ctx.getBean("professor",Professor.class));
		System.out.println(ctx.getBean("peri",College.class));
//		System.out.println(ctx.getBean("college",College.class));
	}

@Bean
@Primary
public Student ram() {
	Student ram =new Student();
	ram.setId(101);
	ram.setFirstName("Ram");
	return ram;
}
@Bean
public Student manoj() {
	Student manoj =new Student();
	manoj.setId(102);
	manoj.setFirstName("Manoj");
	return manoj;
}
@Bean
@Primary
public Professor shyam() {
	Professor shyam =new Professor();
	shyam.setId(201);
	shyam.setName("Shyam");
	shyam.setStudent1(ram());
	return shyam;
}
@Bean
//@Primary
public Professor sandy() {
	Professor sandy =new Professor();
	sandy.setId(202);
	sandy.setName("Sandy");
	sandy.setStudent1(manoj());
	return sandy;
}
@Bean
public College peri() {
	College peri =new College();
	peri.setProf(shyam());
//	peri.setProfessor(shyam());
	return peri;
}
}