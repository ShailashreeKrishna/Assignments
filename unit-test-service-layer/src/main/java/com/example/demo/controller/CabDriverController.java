package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CabDriver;

import com.example.demo.service.CabDriverService;




@RestController
@RequestMapping(path="/api/v1/drivers")
@CrossOrigin(origins ="*")//this is use to connect reactjs with spring
public class CabDriverController {
	
	
	@Autowired
	private CabDriverService service;
	
//	@Value("${server.port}")
//	private String port;

//	@PostMapping
//	public CabDriver add(@RequestBody CabDriver entity) {
//		 return this.service.save(entity);
//	}
	
	 
	@PostMapping
	 public ResponseEntity<CabDriver> add(@RequestBody CabDriver entity){
		 
		 CabDriver card=this.service.add(entity);
		 
		 return ResponseEntity.status(201).body(card);
		 
	 }
	
	@GetMapping
	public List<CabDriver> findAll(){
		
		return this.service.findAll();
	}
	
	@GetMapping(path="/{id}")
	public CabDriver findById(@PathVariable("id") int id) {
		
		return this.service.findById(id).orElseThrow(()->new  RuntimeException("Element not Found"));
	}
	
	@GetMapping(path="/srch/{name}")
	public CabDriver findByName(@PathVariable("name")String name) {
	CabDriver found=this.service.getByDriverName(name);
	//found.setLocation(found.getLocation()+":"+port);
	return found;
	
	
}
	

	
}
