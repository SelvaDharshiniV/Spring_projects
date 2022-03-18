package com.example.demo.resource;


import java.io.File;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/rest")
public class StudentImageResource {
	@GET
	@Path("/image")
	@Produces("image/jpeg")
	public File getImageRepresentaion() {
		return new File("e://bg1.jpg");
	}
	@GET
	@Path("/students/details")
	@Produces(MediaType.APPLICATION_JSON)
	public String getStudentDetails() {
		JsonObject map= Json.createObjectBuilder().add("name","ram").add("age","24").build();
		return map.toString();
	}
}
