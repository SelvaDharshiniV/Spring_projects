package com.example.demo;


import com.example.demo.model.Book;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ClientApplication {

	public static void makeGetRequest() {
		Client client= ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8083/rest").path("/books");
		Invocation.Builder builder= target.request(MediaType.APPLICATION_JSON);
		Response response =builder.get();
		System.out.println(response.readEntity(String.class));
	}
	public static void makePostRequest() {
		Client client= ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8083/rest").path("/books");
		Invocation.Builder builder= target.request(MediaType.APPLICATION_JSON);
//		String bookRef= {/};
		Book bookRef= new Book(201,"Spring in action",575,"Kanic");
		Response response =builder.post(Entity.entity(bookRef, MediaType.APPLICATION_JSON));
		System.out.println(response.readEntity(String.class));
	}
	public static void main(String[] args) {
//makeGetRequest();
		makePostRequest();
	}

}
