package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("mainresource")

public class MainResources {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	
	public String getMessage() {
		return "Hello Friend";
	}

}
