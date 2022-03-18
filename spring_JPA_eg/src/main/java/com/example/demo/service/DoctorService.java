package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorRepository;
@Service
public class DoctorService {

	private DoctorRepository repo;
	public DoctorService(DoctorRepository repo) {
		super();
		this.repo=repo;
		System.out.println(this.repo.getClass().getName());
	}
	public List<Doctor> findAll() {
		return this.repo.findAll();
	}
}
