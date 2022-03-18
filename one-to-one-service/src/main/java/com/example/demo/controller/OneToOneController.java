package com.example.demo.controller;

import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Company;


@RequestMapping(path="/api/v1")
@RestController
public class OneToOneController {

	@Autowired
	private RestTemplate template;
	
	@GetMapping(path="/employee")
	public Company[] getCompany() {
		return this.template.getForObject("http://ONE-TO-ONE-CACHE/api/v1/companies", Company[].class);	
	}
	@PostMapping(path="/employee")
	public Company addCompany(@RequestBody Company entity) {
		HttpEntity<Company> ent= new HttpEntity<>(entity);
		return this.template.postForObject("http://ONE-TO-ONE-CACHE/api/v1/companies", ent,Company.class );	
	}
}
