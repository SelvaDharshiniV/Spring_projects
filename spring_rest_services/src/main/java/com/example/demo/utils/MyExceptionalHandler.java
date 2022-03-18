package com.example.demo.utils;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.controller.IdNotFoundException;
import com.example.demo.exception.CustomException;

@RestControllerAdvice
public class MyExceptionalHandler {
	@ExceptionHandler(RuntimeException.class)
	public CustomException handleRunTimeException(Exception ex, WebRequest req) {
		return new CustomException(LocalDateTime.now(),ex.getMessage(),req.getDescription(false));
	}
	@ExceptionHandler(IdNotFoundException.class)
	public CustomException handleIdNotFoundException(Exception ex, WebRequest req) {
		return new CustomException(LocalDateTime.now(),ex.getMessage(),req.getDescription(false));
	}
	

}
