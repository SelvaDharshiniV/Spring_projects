package com.example.demo.entity;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company implements Serializable {
	private int companyId;
	
	private String companyName;
	
	private String typeOfBusiness;
	
	private Vendor vendor;

}
