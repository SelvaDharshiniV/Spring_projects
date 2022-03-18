package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BookService;

@RestController
@RequestMapping(path="/api/v1")
public class BookController {
	@Autowired
	BookService service;
	
	@GetMapping(path="/books/{topic}")
	public String getBestBook(@PathVariable String topic) {
		return service.suggestBestBook(topic);
	}

}
