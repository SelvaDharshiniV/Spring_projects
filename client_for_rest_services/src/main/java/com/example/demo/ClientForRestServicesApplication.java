package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest.Headers;

import com.example.demo.model.Student;

@SpringBootApplication
public class ClientForRestServicesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(ClientForRestServicesApplication.class, args);
		RestTemplate template = ctx.getBean(RestTemplate.class);
		
		HttpEntity<HttpHeaders> entity=ctx.getBean(HttpEntity.class);
		
		ResponseEntity<String> response= template.exchange("http://localhost:8099/api/v1/students",HttpMethod.GET, entity, String.class);
		//get
//		String response= template.getForObject("http://localhost:8099/api/v1/students", String.class);
		System.out.println("Response from REST API: "+response);
		
		
		//post
//		HttpHeaders headers= new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		
//		Map<String, Object> map=new HashMap<>();
//		map.put("rollNumber",105);
//		map.put("studentName","Raj");
//		map.put("markScored",89);
//		
//		HttpEntity<Map<String, Object>> entity=new HttpEntity<>(map,headers);
//		ResponseEntity<String> response= template.postForEntity("http://localhost:8099/api/v1/students", entity, String.class);
//		System.out.println(response.getBody());
//		System.out.println("status code: "+response.getStatusCodeValue());
//		System.out.println("Location: "+response.getHeaders().get("location"));
	
		
		//put
//		HttpHeaders headers= new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		Map<String, Object> map=new HashMap<>();
//		map.put("rollNumber",105);
//		map.put("studentName","Raj");
//		map.put("markScored",86);
//		
//		template.put("http://localhost:8099/api/v1/students", map);
	
		//exchange
//		HttpHeaders headers= new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		Map<String, Object> map=new HashMap<>();
//		map.put("rollNumber",106);
//		map.put("studentName","Sandy");
//		map.put("markScored",92);
//		
//		HttpEntity<Map<String, Object>> entity=new HttpEntity<>(map,headers);
////		ResponseEntity<String> response= template.exchange("http://localhost:8099/api/v1/students",HttpMethod.POST, entity, String.class);
////		ResponseEntity<String> response= template.exchange("http://localhost:8099/api/v1/students",HttpMethod.DELETE, entity, String.class);
//		ResponseEntity<String> response= template.exchange("http://localhost:8099/api/v1/students",HttpMethod.GET, entity, String.class);
//
//		System.out.println(response.getBody());
//		System.out.println("status code: "+response.getStatusCodeValue());
//		System.out.println("Location: "+response.getHeaders().get("location"));
//	
	}
	@Bean
	public HttpHeaders header(){
		HttpHeaders headers= new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}
	@Bean
	public HttpEntity<HttpHeaders> entity(HttpHeaders header){
		HttpEntity<HttpHeaders> entity= new HttpEntity<HttpHeaders>(header);
		return entity;
	}
	@Bean
	public RestTemplate template(BasicAuthenticationInterceptor interceptor) {
		RestTemplate template= new RestTemplate();
		template.getInterceptors().add(interceptor);
		return template;
	}
	@Bean
	public BasicAuthenticationInterceptor interceptor() {
		return new BasicAuthenticationInterceptor("guest","guest");
		
	}
}
