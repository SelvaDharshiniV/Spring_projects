package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.OrderService;

@SpringBootApplication
public class Ex12IocContainersApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(Ex12IocContainersApplication.class, args);
//		System.out.println(ctx.getBean("sale1"));
		
		OrderService service=ctx.getBean(OrderService.class);
		System.out.println(service.findTotal());
//		for(List<OrderService> list:service) {
//			System.out.println(list);
//		}
//		System.out.println(service);
	}

}
