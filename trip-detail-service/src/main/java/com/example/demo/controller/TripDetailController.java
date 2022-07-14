package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TripDetail;
import com.example.demo.service.TripDetailService;

@RestController
@RequestMapping(path="/api/v1/trips")
public class TripDetailController {

	
 private TripDetailService service;

 @Autowired
public TripDetailController(TripDetailService service) {
	super();
	this.service = service;
}
 
 @PostMapping
 public TripDetail add(@RequestBody TripDetail entity) {
	 
	 return this.service.save(entity);
 }
 
 @GetMapping
 public List<TripDetail> getAll(){
	 
	 return this.service.findAll();
 }
 
 
 @GetMapping(path="/srch/{id}")
 
 public List<TripDetail> findDriverId(@PathVariable("id") int id) {
	 
	 return this.service.getById(id);
 }
 

 

}
