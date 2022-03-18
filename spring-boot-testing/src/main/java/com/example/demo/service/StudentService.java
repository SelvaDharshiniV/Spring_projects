package com.example.demo.service;


import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public String getStudent(int id) {
		return id==1?"Kamala":"Vimala";
	}
	
}
