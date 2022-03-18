package com.example.demo.resource;

import java.sql.Connection;
import java.util.List;


import com.example.demo.daos.DoctorDao;
import com.example.demo.enums.DataBaseName;
import com.example.demo.ifaces.DoctorRepository;
import com.example.demo.model.Doctor;
import com.example.demo.util.ConnectionFactory;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/rest")
public class DoctorResource {
	Connection con=ConnectionFactory.getConnection(DataBaseName.ORACLE);

	//DoctorDao service =  new DoctorDao(con);
	DoctorRepository<Doctor> repo= new DoctorDao(con);

	@GET
	@Path("/doctors")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Doctor> getBookList(){
		return repo.findAll();
	}
	@POST
	@Path("/doctors")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addBookList(Doctor entity){
		int result= repo.add(entity);
		if (result!=0) {
			return Response.status(201).entity(entity).build(); 
		}else {
			return Response.status(200).entity("Not Created").build();
		} 
//		return Response.status(200).entity(entity).build();
	}
	
	@DELETE
	@Path("/doctors/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removeBookById(@PathParam("id") int id){
		repo.deleteById(id);
			 return Response.status(204).entity("Removed").build();
	}
	
}
