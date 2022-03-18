package com.example.demo.entity;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.PastOrPresent;

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
@Component
public class BloodDonor {
	@Id
	@Column(name="mobilenumber")
	@Range(min=11)
	long mobileNumber;
	@Column(name="firstname")
	@Length(min=3,max=8,message="First name should be 3-8 characters")
	String firstName;
	@Column(name="bloodgroup")
	String bloodGroup;
	@Column(name="datelastdonated")
	@PastOrPresent(message="Donated date should be earlier or todays date ")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate dateLastDonated;

}
