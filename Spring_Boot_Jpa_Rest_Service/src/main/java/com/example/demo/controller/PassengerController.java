package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Passenger;
import com.example.demo.service.PassengerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(path="api/v1")
public class PassengerController {

	PassengerService service;

	@Autowired
	public PassengerController(PassengerService service) {
		super();
		this.service = service;
	}
	
	
	@PostMapping(path="/passengers/add")
	public Passenger addAll(@RequestBody Passenger entity) {
		
		return this.service.add(entity);
	}
	

	@GetMapping(path="/passengers")
	public List<Passenger> getAll(){
		return this.service.getAll();
	}

	@GetMapping(path="/passengers/srch/name/{passengerName}")
	
	public List<Passenger> getByPassengerName(@PathVariable("passengerName") String name) {
		
		return this.service.findByName(name);
	}
	
	@GetMapping(path="/passengers/srch/date/{tripDateTime}")
	
	public List<Passenger> getByTripDateTime(@PathVariable("tripDateTime") @DateTimeFormat(iso=ISO.DATE_TIME) LocalDateTime date) {
		
		return this.service.findByDate(date);
	}
	
	@PutMapping(path="/passengers/id/{id}/location/{location}")
	
	public ResponseEntity<Object> updateLocation(@PathVariable("id") int passengerId,@PathVariable("location") String Location){
		
		int rowupdated=this.service.updateLocation(passengerId, Location);
		if(rowupdated!=0) {
			return ResponseEntity.status(200).body(rowupdated+"row updated");
		}else {
			return ResponseEntity.ok("Not Updated");
		}
	}
}
