package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path="/api/v1")
@RestController
public class CibilController {
	
	@Value("${server.port}")
	private String port;

	@GetMapping(path="/score")
	public String getScore() {
		return "Good Score running in : "+port;
	}
}
