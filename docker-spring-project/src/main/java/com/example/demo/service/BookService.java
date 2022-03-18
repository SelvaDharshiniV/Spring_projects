package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {
public String suggestBestBook(String topic) {
	String response="faceBook";
	if(topic.equals("java")) {
		return "Head first java";
	}
	return response;
}
}
