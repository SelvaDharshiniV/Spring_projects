package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class EmployeeController {
	
	@GetMapping(path="/employee")
	public String getBestBook() {
		return "Haii Dharshini";
	}

}