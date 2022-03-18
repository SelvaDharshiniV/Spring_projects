package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="sd_test_emp")
public class Employee {
	@Id
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="father_name")
	private String fatherName;
	
	@Column(name="contact_num")
	private long contactNum;
	
	@Column(name="address")
	private String address;
	
	@Column(name="location")
	private String location;

	@Column(name="salary")
	private int salary;
	
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;

	@Column(name="date_of_join")
	private LocalDate dateOfJoin;

	@Column(name="created_date")
	private LocalDate createdDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_date")
	private LocalDate modifiedDate;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@OneToMany(targetEntity = Designation.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_ref", referencedColumnName = "emp_id")
	List<Designation> desList;

}
