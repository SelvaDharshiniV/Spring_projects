package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path="/api/v1")
public class ChildController {
	
	@Autowired
	RestTemplate template;
	@GetMapping(path="/child")
	public String getBestBook() {
		 String value=template.getForObject("http://parent-service:6090/api/v1/parent",String.class);;
		 return value;
	}

}