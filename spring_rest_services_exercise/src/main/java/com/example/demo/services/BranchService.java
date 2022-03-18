package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Branch;
import com.example.demo.model.LoanEntity;
import com.example.demo.repos.BranchRepository;

@Service
public class BranchService {

	@Autowired
	private BranchRepository repo;

	public List<Branch> findAll(){
		return repo.findAll();
	}
	public Branch add(Branch entity) {
		return this.repo.save(entity);
	}
}
