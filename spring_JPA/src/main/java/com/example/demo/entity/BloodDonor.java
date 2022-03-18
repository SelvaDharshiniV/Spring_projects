package com.example.demo.entity;

import java.time.LocalDate;

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
@Table(name="sd_blood_donor")
public class BloodDonor {
	@Id
	@Column(name="mobilenumber")
	long mobileNumber;
	@Column(name="firstname")
	String firstName;
	@Column(name="bloodgroup")
	String bloodGroup;
	@Column(name="datelastdonated")
	LocalDate dateLastDonated;

}
