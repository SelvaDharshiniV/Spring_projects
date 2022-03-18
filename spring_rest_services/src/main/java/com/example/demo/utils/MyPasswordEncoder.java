package com.example.demo.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyPasswordEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
		System.out.println(encoder.encode("guest"));
	}

}
