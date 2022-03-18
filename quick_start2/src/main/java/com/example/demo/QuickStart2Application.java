package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.College;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.model.Professor;
import com.example.demo.model.Student;

@SpringBootApplication
public class QuickStart2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(QuickStart2Application.class, args);
//		System.out.println(ctx);
		System.out.println(ctx.getBean("ram"));
		System.out.println(ctx.getBean("sangee"));
		System.out.println(ctx.getBean("manoj",Student.class));
//		System.out.println(ctx.getBean("manoj"));
//		Patient p= new Patient(201,"sk",23);
//		Doctor d=new Doctor(101,"Ram","Chennai", sk);
//		System.out.println(d);
		System.out.println(ctx.getBean("apollo"));
		
//		Professor prof=ctx.getBean(Professor.class);
		
//		Even if we call getbean method multiple times on the same class it will be called only once
//		(i.e) spring beans are singleton by default
//		System.out.println(ctx.getBean(Professor.class));
//		System.out.println(ctx.getBean(Professor.class));
//		System.out.println(ctx.getBean(Professor.class));
//		System.out.println("Expected: null , Actual : "+prof.getStudent());
		
		College krishna=ctx.getBean(College.class);
		System.out.println(krishna.getProf());
	}

}
