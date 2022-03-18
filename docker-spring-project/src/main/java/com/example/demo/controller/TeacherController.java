package com.example.demo.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path ="/api/v2")
public class TeacherController {
	@GetMapping(path ="/teachers")
	public String getMessage(Principal principal) {
		System.out.println("Current user: "+principal);
		return "Hello form teacher controller";
	}
}
