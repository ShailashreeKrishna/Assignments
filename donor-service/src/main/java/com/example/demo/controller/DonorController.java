package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DonorDetails;
import com.example.demo.repository.DonorRepository;
import com.example.demo.service.DonorService;

@RestController
@RequestMapping(path="/api/v1/donars")
@CrossOrigin("*")
public class DonorController {

	
	@Autowired
	private DonorService service;
	
	@PostMapping
	public DonorDetails add(@RequestBody DonorDetails entity) {
		 return this.service.save(entity);
	}
	
	@GetMapping
	public List<DonorDetails> findAll(){
		
		return this.service.findAll();
		
}
	@GetMapping(path="/srch/{id}")
	public DonorDetails[] findById(@PathVariable("id") int id){
		
		return this.service.findById(id);
	}
	
	
	@GetMapping(path="/srch/bloodgroup/{bloodGroup}")
	public DonorDetails[] findByBloodGroup(@PathVariable("bloodGroup") String bloodGroup){
		
		return this.service.getByBloodGroup(bloodGroup);
	}
	
	
    @PutMapping(path="/id/{id}/location/{location}")
	
	public ResponseEntity<Object> updateLocation(@PathVariable("id") int donorId,@PathVariable("location") String Location){
		
		int rowupdated=this.service.updateLocation(donorId, Location);
		if(rowupdated!=0) {
			return ResponseEntity.status(200).body(rowupdated+"row updated");
		}else {
			return ResponseEntity.ok("Not Updated");
		}
	}
    
    @DeleteMapping(path = "/{id}")
	public ResponseEntity<String> remove(@PathVariable("id")  int id){
		
		this.service.remove(id);

		
		return ResponseEntity.status(HttpStatus.OK).body("one row deleted");
		
	}
    //to update all details of donor
    @PutMapping(path = "/update")
    public DonorDetails saveOrUpdate(@RequestBody DonorDetails entity) {
    	
    	return this.service.saveOrUpdate(entity);
    }
	
	
}
