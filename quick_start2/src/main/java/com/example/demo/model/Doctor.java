package com.example.demo.model;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
//@Setter
//@Getter
@Data
@FieldDefaults(level =AccessLevel.PRIVATE)
public class Doctor {
//	simple values
	int doctorId;
	String doctorName;
	String location;
	
//	reference to other bean
//	Collabrating Objects
	
	Patient patient;
}