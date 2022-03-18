package com.example.demo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.model.Professor;
import com.example.demo.model.Student;

@Configuration
public class AppConfig {
//Factory method with a Bean id same as method name- here it is ram
	@Bean
	public Doctor ram(@Qualifier("sk")Patient skd) {
		return new Doctor(101,"Ram","Chennai", skd);
	}
	//Factory method with a Bean id same as method name- here it is shyam
		@Bean ("sangee")//this method will decscribe how the obj should be created
		public Doctor shyam(@Qualifier("vicky")Patient skd) {
			return new Doctor(102,"Shyam","Chennai", skd);
		}
		@Bean
		public Patient sk() {
			return new Patient(201,"Sk",23);
		}
		@Bean
		public Patient vicky() {
			return new Patient(202,"Vicky",25);
		}
		@Bean
		public Patient kanic() {
			return new Patient(203,"Kanic",24);
		}
		@Bean
		public Integer number() {
			return Integer.valueOf(100);
		}
		
//		@Bean
//		public Professor kanicRaj(Student manoj) {
//			return new Professor(203,manoj);
//		}
		@Bean
		public Student manoj(){
			return new Student(101,"manoj");
		}
//		@Bean
//		public Student manoj1(){
//			return new Student(101,"manoj");
//		}
}
