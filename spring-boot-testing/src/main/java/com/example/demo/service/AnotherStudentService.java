package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.StudentRepository;

@Service
@Lazy
public class AnotherStudentService {
	
	@Autowired
	StudentRepository repo;

	public String getStudent(int id) {
		return this.repo.findById(id).toUpperCase();

	}
}
