package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Complaint;
import com.example.demo.entity.Customer;
import com.example.demo.repos.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	List<Complaint> compliantList;
	
	@Autowired
	Customer customer;
	
	@Autowired
	private CustomerRepository repo;
	
	public Customer createCustomer() {
		customer.setId(999);
		customer.setCustomerName("Raj");
		customer.setLocation("Chennai");
		customer.setMobileNumber(908013003);
		customer.setCompList(compliantList);
		return customer;
		
	}
	public List<Customer> findAll(){
		return repo.findAll();
	}
}
