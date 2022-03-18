package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LoanEntity;
import com.example.demo.repos.LoanRepository;
@Service
public class LoanService {
	@Autowired
	private LoanRepository repo;
	
	public LoanEntity add(LoanEntity entity) {
		return this.repo.save(entity);
	}
	public List<LoanEntity> findAll() {
		return this.repo.findAll();
	}
	public Optional<LoanEntity> findById(int AppNum) {
		return this.repo.findById(AppNum);
	}
	public LoanEntity update(LoanEntity entity) {
		return this.repo.save(entity);
	}
	public Optional<LoanEntity> remove(LoanEntity entity){
		Optional<LoanEntity> value= Optional.empty();
		if(this.repo.existsById(entity.getApplicationNumber())) {
			this.repo.delete(entity);
			value=Optional.of(entity);
		}
		return value;
	}
	public Optional<Object> removeByApplicationNumber(int applicationNumber){
	Optional<Object> value= Optional.empty();
	if(this.repo.existsById(applicationNumber)) {
		this.repo.deleteById(applicationNumber);
		value=Optional.of(applicationNumber);
	}
	return value;
	}
//	public LoanEntity findByApplicationName(String AppName) {
//		return this.repo.findByApplicationName(AppName);
//	}
}
