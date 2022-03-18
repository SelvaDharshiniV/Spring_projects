package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Company;
import com.example.demo.services.CompanyServices;

import lombok.AllArgsConstructor;
@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping(path="api/v1")
public class CompanyController {
	
	private CompanyServices service;
	
//	@Value("${server.port}")
//	private String port;
//
//	@GetMapping(path="/company")
//	public String getCompany() {
//		return "Good Score running in : "+port;
//	}
	@GetMapping(path="/companies")
	public List<Company> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path="/companies/{id}")
	public Company findById(@PathVariable int id){
		return this.service.findById(id).orElseThrow(()-> new RuntimeException("Not Found"));
	}
	
	@PostMapping(path="/companies")
	public Company add(@RequestBody Company entity){
		return this.service.add(entity);
	}
	@DeleteMapping(path = "/companies/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		this.service.delete(id);
		return ResponseEntity.ok("Record deleted");
	}
	@PutMapping(path = "/companies")
	public Company update(@RequestBody Company entity){
		return this.service.update(entity);
	}
}
