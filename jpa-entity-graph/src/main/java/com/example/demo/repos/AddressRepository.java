package com.example.demo.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	@EntityGraph(attributePaths = {"user","city"},type = EntityGraphType.LOAD)
	public List<Address> findAll();
	@EntityGraph(attributePaths = {"user","city"},type = EntityGraphType.LOAD)
	public Optional<Address> findById(int id);
	@EntityGraph(attributePaths = {"city"},type = EntityGraphType.LOAD)
	public List<Address> findByCityCityId(int cityId);
	@EntityGraph(attributePaths = {"user"},type = EntityGraphType.LOAD)
	public List<Address> findByUserUserId(int userId);
}
