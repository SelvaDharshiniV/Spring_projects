package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.model.Branch;
import com.example.demo.model.LoanEntity;
import com.example.demo.services.BranchService;

@RestController
@RequestMapping(path="/api/v1")
public class BranchController {
	@Autowired
	private BranchService service;
	
	@GetMapping(path="/branchs")
	public List<Branch> findAll(){
		return service.findAll();
	}
	@PostMapping(path="/branchs")
	@RolesAllowed(value={"ROLE_ADMIN"})
	public Branch addloan(@RequestBody Branch branch) {
		 return this.service.add(branch);
	}
}
