package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.ToString;
@ToString
@Component
public class Student {
	private int id;
	private String name;
	
	public Student() {
		super();
		System.out.println("***Student created***");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


}
