package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path="api/v1")
@AllArgsConstructor
public class EmployeeController {
	private EmployeeService service;
	
	@GetMapping(path = "/employees")
	public List<Employee> findAll() {
		return service.findAll();
	}

	@PostMapping(path = "/employees")
	public Employee add(@RequestBody Employee employee) {
		return service.add(employee);
	}
	
	@PutMapping(path = "/employees")
	public Employee update(@RequestBody Employee employee) {
		return service.add(employee);
	}
	@GetMapping(path="/employees/{id}")
	public Employee findById(@PathVariable int id){
		return this.service.findById(id).orElseThrow(()-> new RuntimeException("Not Found"));
	}
	
	@DeleteMapping(path = "/employees/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		this.service.delete(id);
		return ResponseEntity.ok("Record deleted");
	}
}
