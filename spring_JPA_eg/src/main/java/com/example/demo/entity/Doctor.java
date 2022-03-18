package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)

@Entity
@Table(name="selva_doctor")
public class Doctor {
	@Id
	@Column(name="doctorid")
 int doctorId;
	@Column(name="docytoname")
 String docytoName;
	@Column(name="handphone")
 Long handPhone;
	@Column(name="email")
 String email;
	@Column(name="specialiation")
 String specialiation;
	@Column(name="city")
 String city;
 
}
