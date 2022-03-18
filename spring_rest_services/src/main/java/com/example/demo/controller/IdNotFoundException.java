package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class IdNotFoundException extends RuntimeException {
	private String message;

	@Override
	public String getMessage() {
		return message.toUpperCase();
	}
}

