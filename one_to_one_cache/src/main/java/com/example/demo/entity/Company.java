package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="sd_company")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company implements Serializable {
	@Id
	@Column(name = "company_id")
	private int companyId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "type_of_business")
	private String typeOfBusiness;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vendor_ref")
	private Vendor vendor;

}
