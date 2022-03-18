package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component

@Entity
@Table(name = "sd_customer")
public class Customer {
	@Id
//	@SequenceGenerator(name="seq",sequenceName = "selva_num_seq",allocationSize = 1)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="mobilenumber")
	private long mobileNumber;
	@Column(name="customername")
	private String customerName;
	@Column(name="location")
	private String location;
	@OneToMany(targetEntity = Complaint.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_ref", referencedColumnName = "id")
	List<Complaint> compList;

}
