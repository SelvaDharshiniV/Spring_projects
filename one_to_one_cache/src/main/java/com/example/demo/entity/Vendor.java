package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="sd_vendor")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vendor implements Serializable{
	
	@Id
	@Column(name = "vendor_id")
	private int vendorId;

	@Column(name = "vendor_name")
	private String vendorName;
	
	@Column(name = "location")
	private String location;

	@Column(name = "service")
	private String service;

}
