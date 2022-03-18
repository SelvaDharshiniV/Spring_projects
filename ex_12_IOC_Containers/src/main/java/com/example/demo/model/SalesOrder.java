package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@Component 
public class SalesOrder {
	int orderId;
	LocalDate createdDate;
	Customer customer;
	List<Item> itemList;
	
	public SalesOrder() {
		super();
	}
	
//	public SalesOrder(int orderId, LocalDate createdDate, Customer customer, List<Item> itemList) {
//		super();
//		this.orderId = orderId;
//		this.createdDate = createdDate;
//		this.customer = customer;
//		this.itemList = itemList;
//	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	@Autowired
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	@Autowired
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	@Override
	public String toString() {
		return "SalesOrder [orderId=" + orderId + ", createdDate=" + createdDate + ", customer=" + customer
				+ ", itemList=" + itemList + "]";
	}
	
	
}

