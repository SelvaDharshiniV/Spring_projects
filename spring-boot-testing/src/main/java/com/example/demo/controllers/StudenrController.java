package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
@RequestMapping
public class StudenrController {
	@Autowired
	private StudentService service;
	
	@GetMapping(path="/students")
	public String getAllStudent() {
		return "Kamala,Vimala";	
	}
	@GetMapping(path="/students/{id}")
	public String getStudentById(@PathVariable int id) {
		return this.service.getStudent(id);	
	}

}
