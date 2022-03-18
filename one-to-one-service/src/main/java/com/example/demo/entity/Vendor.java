package com.example.demo.entity;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vendor implements Serializable{
	
	private int vendorId;

	private String vendorName;
	
	private String location;

	private String service;

}
