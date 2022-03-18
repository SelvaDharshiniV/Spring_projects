package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByDesignation(String designation);
	@Query(value="select * from sd_test_emp where salary>=:from and salary<=:to",nativeQuery = true)
	public Employee findBySalary(@Param("from") int from,@Param("to") int to);
}
