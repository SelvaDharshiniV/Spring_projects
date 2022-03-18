package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringDockerComposeChildApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerComposeChildApplication.class, args);
	}
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
