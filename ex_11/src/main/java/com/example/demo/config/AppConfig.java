package com.example.demo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.model.Customer;
import com.example.demo.model.Invoice;

@Configuration
public class AppConfig {
	@Bean
	public Invoice invoice1(Customer kanic) {
		return new Invoice(201, kanic, 1999);
	}
	@Bean
	public Invoice invoice2(@Qualifier("selva")Customer inv) {
		return new Invoice(202, inv, 2000);
	}
	@Bean
	public Customer kanic() {
		return new Customer(101, "Kanic", 73391, "kanic@abc.com");
	}
	@Bean
	public Customer selva() {
		return new Customer(102, "Selva", 90801, "selva@abc.com");
	}
	@Bean
	public Customer sandy() {
		return new Customer(103, "Sandy", 97104, "sandy@abc.com");
	}
}
