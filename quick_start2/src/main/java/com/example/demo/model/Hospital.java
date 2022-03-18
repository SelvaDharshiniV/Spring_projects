package com.example.demo.model;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;
@Component("apollo") // to register as a bean can also be done using a method with @Bean annotation
@ToString
public class Hospital {
	List<Patient> patientList;
	@Autowired  // Injecting the list of patients into the constructor
	public Hospital(List<Patient> patientList) {
		super();
		this.patientList=patientList;
	}	
}
