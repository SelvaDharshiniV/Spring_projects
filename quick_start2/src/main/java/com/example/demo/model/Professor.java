package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;
@ToString
@Component
public class Professor {
	private int id; // simple value
	private Student student;//reference to other bean
	
//	public Professor() {
//		super();
//		System.out.println("Inside Professor - Zero Argument==========");
//	}
	
	
//	if no Autowired the zero argu constructor is called as default.
//@Autowired
	public Professor(int id, Student student) {
		super();
		System.out.println("Inside Professor - Two Argument==========");
		this.id = id;
		this.student = student;
	}
	
//	@Autowired
//	public Professor(Student student) {
//		super();
//		this.student = student;
//	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
//	@Autowired
	public void setStudent(Student student) {
		this.student = student;
	}

}
