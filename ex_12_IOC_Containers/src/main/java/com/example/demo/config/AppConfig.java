package com.example.demo.config;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Item;
import com.example.demo.model.SalesOrder;
@Configuration
public class AppConfig {

	@Bean
	public SalesOrder sale1(Customer kanic,List<Item> tv) {
//		return new SalesOrder(101, LocalDate.of(2021,01,12),kanic,tv);
		SalesOrder sale= new SalesOrder();
		sale.setOrderId(101);
		sale.setCreatedDate( LocalDate.of(2021,01,12));
		sale.setCustomer(kanic);
		sale.setItemList(tv);
		return sale;
	}@Bean
	public Customer manoj() {
		return new Customer(201, "Manoj", "Chennai");
	}
	@Bean
	public Item sony() {
		return new Item(01, "Televition", 1.0,100.0);
	}
	@Bean
	public Item sam() {
		return new Item(02, "Televition", 3.0,50.0);
	}
}
