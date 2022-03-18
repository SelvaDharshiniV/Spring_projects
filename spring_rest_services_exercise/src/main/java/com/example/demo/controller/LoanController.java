package com.example.demo.controller;


import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.exception.IdNotFoundException;
import com.example.demo.model.LoanEntity;
import com.example.demo.services.LoanService;

@RestController
@RequestMapping(path ="/api/v1")
public class LoanController {
	@Autowired
	private LoanService service;
	
	@PostMapping(path="/loans")
	@RolesAllowed(value={"ROLE_ADMIN"})
	public ResponseEntity<LoanEntity> addloan(@RequestBody LoanEntity loan) {
		URI uri=ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/id")
				.buildAndExpand(loan.getApplicationNumber())
				.toUri();
		 LoanEntity addedEntity=this.service.add(loan);
		 return ResponseEntity.created(uri).body(addedEntity);
	}
	
	@GetMapping(path="/loans")
	@RolesAllowed(value={"ROLE_ADMIN","ROLE_GUEST"})
	public List<LoanEntity> findAll(){
		return this.service.findAll();
	}
	@GetMapping(path ="/loans/{AppNumber}")
	public LoanEntity getLoanByAppNum(@PathVariable("AppNumber") int applicationNumber) {
		return this.service.findById(applicationNumber)
				.orElseThrow(()->new IdNotFoundException("Element With "+applicationNumber+" not present"));
	}
//	@GetMapping(path ="/loans/{AppName}")
//	public LoanEntity findByApplicationName(@PathVariable("AppName") String applicationName) {
//		return this.service.findByApplicationName(applicationName);
////				.orElseThrow(()->new RuntimeException("Element With "+applicationName+" not present"));
//	}
	@PutMapping(path="/loans")
	public LoanEntity loanUpdate(@RequestBody LoanEntity entity) {
		return this.service.update(entity);
	} 
	
	@DeleteMapping(path="/loans")
	public ResponseEntity<LoanEntity> remove(@RequestBody LoanEntity entity){
		LoanEntity delete= this.service.remove(entity)
				.orElseThrow(()-> new RuntimeException("Element With "+entity.getApplicationNumber()+" not present"));;
		return ResponseEntity.status(200).body(delete);
	}
	@DeleteMapping(path="/loans/{AppNumber}")
	public void removeByApplicationNumber(@PathVariable("AppNumber") int applicationNumber){
		 this.service.removeByApplicationNumber(applicationNumber)
				.orElseThrow(()->new IdNotFoundException("Element With "+applicationNumber+" not present"));
	}
}
