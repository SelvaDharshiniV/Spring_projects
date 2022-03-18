package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LoanEntity;

public interface LoanRepository extends JpaRepository<LoanEntity, Integer> {
 
//  LoanEntity findByApplicationName(String name);

}
