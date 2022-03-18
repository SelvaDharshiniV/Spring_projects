package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.BloodDonor;
import com.example.demo.repos.BloodDonorRepository;

@Service
public class BloodDonorService {
	private BloodDonorRepository repo;
	public BloodDonorService(BloodDonorRepository repo) {
		super();
		this.repo=repo;
		System.out.println(this.repo.getClass().getName());
	}
	public BloodDonor add(BloodDonor donor) {
		return this.repo.save(donor);
	}
	
	public List<BloodDonor> findAll() {
		return this.repo.findAll();
	}
	
	public void delete(long id) {
		this.repo.deleteById(id);
	}
	
	public List<BloodDonor> findByBloodGroup(String group){
		return this.repo.findByBloodGroup(group);
	}

	public BloodDonor update(BloodDonor donor) {	
		return this.repo.save(donor);
	}
	
	public List<BloodDonor> findByFirstName(String srcName){
		return this.repo.findByFirstName(srcName);	
	}
	
	public List<BloodDonor> srcByGroupAndDate(String group,LocalDate date){
		return this.repo.srcByGroupAndDate(group,date);
	}
	
	public int updateLastDonated(LocalDate date, long mobileNumber){
		return this.repo.updateLastDonated(date,mobileNumber);
	}
}
