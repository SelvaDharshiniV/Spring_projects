package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class MessageController {
	
	@GetMapping(path="message")
	private String getMessage() {
		return "Accessed by oauth2 token";
	}

}
