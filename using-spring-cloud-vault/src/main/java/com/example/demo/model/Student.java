package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor

@Entity
@Table(name="sd_student")
public class Student {
	
	@Id
	@Column(name="roll_number")
	private int rollNumber;
	
	@Column(name="student_name")
	private String studentName;

	@Column(name="mark_scored")
	private int markScored;
}
