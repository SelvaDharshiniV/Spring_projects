package com.example.demo.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="sd_loan")
@Component
public class LoanEntity {
	@Id
	@Column(name="application_number")
	private int applicationNumber;
	
	@Column(name="application_name")
	private String applicantName;
	
	@Column(name="application_date")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate applicationDate;
	
	@Column(name="loan_amount")
	private double loanAmount;
	
	@Column(name="type_of_loan")
	private String typeOfLoan;
}
