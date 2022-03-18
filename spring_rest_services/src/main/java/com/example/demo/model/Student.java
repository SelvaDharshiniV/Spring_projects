package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="sd_student")
public class Student {
	@Id
	@Column(name="rollNumber")
	private int rollNumber;
	
	@Column(name="studentName")
	private String studentName;
	
	@Column(name="markScored")
	@Range(min=0,max=100,message="Mark scored by the student")
	@Schema(defaultValue = "0",
	description = "Mark scored by the Student",
	example = "0 to 100")
	private double markScored;
}
