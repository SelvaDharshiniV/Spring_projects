package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.ifaces.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {
	
	private EmployeeRepository repo;
	
	public List<Employee> findAll() {
		return repo.findAll();
	}
	
	@CachePut(cacheNames = "empche", key="#entity.empId")
	public Employee add(Employee entity) {
		return repo.save(entity);
	}
	@Cacheable(cacheNames = "empche", key="#id")
	public Optional<Employee> findById(int id){
		return this.repo.findById(id);
	}
	
	@CacheEvict(cacheNames = "empche", key="#id")
	public void delete(int id){
//		this.repo.deleteById(id);
	}

}
