package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.neo4j.ConfigBuilderCustomizer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Milk;
import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class InheretanceTablePerSubClassApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(InheretanceTablePerSubClassApplication.class, args);
	ProductRepository repo= ctx.getBean(ProductRepository.class);
	Product milk=ctx.getBean(Milk.class);
//	repo.save(milk);
//	System.out.println(repo.save(milk));
	
	Milk found =(Milk) repo.findById(999).get();
	System.out.println(found.getProductId());
	System.out.println(found.getProductName());
	System.out.println(found.getRatePerUnit());
	System.out.println(found.getShelfLife());
	System.out.println(found.getType());
	
	}
	@Bean
	public Milk milk() {
		return new Milk(999,"kovin milk",80.00,"a1milk","one day");
	}

}
