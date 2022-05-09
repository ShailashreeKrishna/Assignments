package com.example.resources;

import java.util.List;
import java.util.Optional;

import org.glassfish.grizzly.http.util.HttpStatus;

import com.example.model.Student;
import com.example.services.StudentServices;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/students")
public class StudentResource {
	
	
	private static StudentServices service= new StudentServices();
	
	public StudentResource() {
		super();
		
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudent() {
	
		return service.getAll();
    
    
	}
	

	@GET
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("rollNumber")int id) {
		
		try {
		Student entity= service.findById(id)
.
				orElseThrow(() -> new RuntimeException("ID not found"));
		
		return Response.ok(entity).build();
		}catch(RuntimeException e) {
			
		e.printStackTrace();
		
		return Response.ok("id not found").status(400).build();
		}
	}
	
		
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response add(Student student) {
	    boolean result =service.add(student);
        if(result) {
        	return Response.ok(student).status(201).build();
        }else {
        	
        
		return Response.status(400,"not Created").build();
	}
	}
	
		
	
	
	@DELETE
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response remove(@PathParam("rollNumber")int id) {
	
	boolean	result= service.remove(id)
;
	if(result) {
		return Response.status(204,"one resource with id deleted").build();
	}
	else {
		return Response.status(400,"not deleted").build();
	}
	}

	@PUT
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	//@Consumes(MediaType.APPLICATION_JSON)
	public Student update(@PathParam("rollNumber")int id, Student newValue) {
		
		return service.update(id,newValue);
	}

	
	

}
