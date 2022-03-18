package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class IdNotFoundException extends RuntimeException {
	private String message;

	@Override
	public String getMessage() {
		return message.toLowerCase();
	}
}
