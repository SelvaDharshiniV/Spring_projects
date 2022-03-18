package com.example.demo.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(path="api/v1")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
@GetMapping(path="/employee")
public List<Employee> findAll() {
	return  service.findAll();
}
@PostMapping(path="/employee")
public Employee addStudent(@RequestBody Employee employee) {
	return this.service.add(employee);
	
}
@PutMapping(path="/employee")
public ResponseEntity<Employee> updateStudent(@RequestBody Employee employee) {
	Employee updated=this.service.updateEmployee(employee);
	return ResponseEntity.status(HttpStatus.OK).body(updated);
	
}
@GetMapping(path ="/employee/{id}")
public Optional<Employee> getById(@PathVariable("id") int id) {
	return this.service.findById(id);
}


@GetMapping(path ="/employee/{designation}")
public Employee getStudentById(@PathVariable("designation") String designation) {
	return this.service.findByDesignation(designation);
}

@GetMapping(path ="/employee/{from}/{to}")
public Employee getBySalary(@PathVariable("from") int from,@PathVariable("id") int to) {

	return this.service.findBySalary(from,to);
}



}
