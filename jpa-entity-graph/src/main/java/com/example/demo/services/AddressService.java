package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.repos.AddressRepository;


@Service
public class AddressService {
	@Autowired
	private AddressRepository repo;

	public void add(Address entity) {

		Address added=this.repo.save(entity);
		System.out.println("Nagar Name: "+added.getNagarName());
		System.out.println("Street Name: "+added.getStreetName());
		System.out.println("City: "+added.getCity());
		System.out.println("User: "+added.getUser());

	}
	public void task1() {
		List<Address> addList=this.repo.findAll();
		for( Address eachAddress:addList) {
			System.out.println("Nagar Name: "+eachAddress.getNagarName());
			System.out.println("Street Name: "+eachAddress.getStreetName());
			System.out.println("City: "+eachAddress.getCity());
			System.out.println("User: "+eachAddress.getUser());
		}
	}
	@Transactional
	public void task2() {
		List<Address> addList=this.repo.findAll();
		for( Address eachAddress:addList) {
			System.out.println("Nagar Name: "+eachAddress.getNagarName());
			System.out.println("Street Name: "+eachAddress.getStreetName());
			System.out.println("City: "+eachAddress.getCity());
			System.out.println("User: "+eachAddress.getUser());
		}
	}
	public void task3(int id) {
		Address found=this.repo.findById(id).get();
			System.out.println("Nagar Name: "+found.getNagarName());
			System.out.println("Street Name: "+found.getStreetName());
			System.out.println("City: "+found.getCity());
			System.out.println("User: "+found.getUser());		
	}

	public void task4(int cityId) {
		List<Address> cityList=this.repo.findByCityCityId(cityId);
		for( Address eachAddress:cityList) {
			System.out.println("Nagar Name: "+eachAddress.getNagarName());
			System.out.println("Street Name: "+eachAddress.getStreetName());
			System.out.println("City: "+eachAddress.getCity());		
	}
	}public void task5(int userId) {
		List<Address> cityList=this.repo.findByUserUserId(userId);
		for( Address eachAddress:cityList) {
			System.out.println("Nagar Name: "+eachAddress.getNagarName());
			System.out.println("Street Name: "+eachAddress.getStreetName());
			System.out.println("User: "+eachAddress.getUser());		
	}
	}
}
