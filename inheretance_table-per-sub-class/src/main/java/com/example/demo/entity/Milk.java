package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.cache.annotation.EnableCaching;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "sd_milk")
@PrimaryKeyJoinColumn(name = "product_ref")
public class Milk extends Product {
	
	public Milk(int productId, String productName, double ratePerUnit, String type, String shelfLife) {
		super(productId, productName, ratePerUnit);
		this.type = type;
		this.shelfLife = shelfLife;
	}

	@Column(name = "type")
	private String type;
	
	@Column(name = "shelf_life")
	private String shelfLife;
	
}
