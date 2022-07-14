package com.example.demo.controller;

import java.util.Arrays;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.TripDTO;
import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetail;

@RestController
@RequestMapping(path="/client")
public class CabDriverClientController {
	
	private RestTemplate template;
	
	@Autowired
	public CabDriverClientController(RestTemplate template) {
		super();
		this.template = template;
	}

	@Autowired
	private TripDTO dto;
	
	private String baseURL="http://CAB-DRIVER-SERVICE/api/v1";
	
	@GetMapping(path="/drivers")
	public String getDrivers() {
		return this.template.getForObject(baseURL+"/drivers",String.class);
	}
	
	
	//this is for load balance example
	@GetMapping(path="/drivers/{id}")
	public String getDriversById(@PathVariable int id) {
		return this.template.getForObject(baseURL+"/drivers/"+id,String.class);
	}
	
	//to get in json format
	@GetMapping(path="/drivers/json")
	public CabDriver getDriversAsJson() {
		return this.template.getForObject(baseURL+"/drivers",CabDriver.class);
	}

	
	@GetMapping(path="/drivers/srch/{name}")
	public String getDriversByName(@PathVariable("name") String name) {
		return this.template.getForObject(baseURL+"/drivers/srch/"+name,String.class);
	}
	
	
	private String baseURL1="http://TRIP-DETAIL-SERVICE/api/v1";
	@GetMapping(path="/trips")
	public String gettrips() {
		return this.template.getForObject(baseURL1+"/trips",String.class);
	}
	
	//merging two service
	@GetMapping(path="/drivers/trips/{id}")
	public String getDriverTrips(@PathVariable("id") int id) {
		String drivers=this.template.getForObject(baseURL+"/drivers/"+id,String.class);
		
		String trips=this.template.getForObject(baseURL1+"/trips/srch/"+id,String.class);
		
		return drivers+trips;
	}
	
	@GetMapping(path = "/drivers/trips/json/{id}")
	public TripDTO getDriverTripsJson(@PathVariable("id") int id) {
		CabDriver driver = this.template.getForObject(baseURL+"/drivers/"+id, CabDriver.class);

		TripDetail[] trips =  this.template.getForObject(baseURL1+"/trips/srch/"+id, TripDetail[].class);
		
		Set<TripDetail> tripSet=Arrays.stream(trips).collect(Collectors.toSet());
		dto.setDriver(driver);
		//List<TripDetail> detailSet = Arrays.asList(trips);
		
		
		
		//Set<TripDetail> triplist = detailSet.stream().collect(Collectors.toSet());
		
		dto.setTrips(tripSet);

		return dto;
		}		
	}


