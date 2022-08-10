package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.entity.PatientDetails;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping(path="/api/v1/patients")
@CrossOrigin("*")
public class PatientController {

	@Autowired
	private PatientService service;
	

	
	@PostMapping
	public PatientDetails add(@RequestBody PatientDetails entity) {
		 return this.service.save(entity);
	}
	
	@GetMapping
	public List<PatientDetails> findAll(){
		
		return this.service.findAll();
}
	
	@GetMapping(path="/srch/{id}")
	public PatientDetails findById(@PathVariable("id") int id){
		
		return this.service.findById(id).orElseThrow(()->new RuntimeException("Id not Found"));
	}
	
	@GetMapping(path="/srch/{location}")
			public List<PatientDetails> findByLocation(@PathVariable("location") String location){
		
		return this.service.getByHospital(location);
	}
	
	
	@GetMapping(path="/srch/bloodgroup/{bloodGroup}")
	
	public PatientDetails[] findByBloodGroup(@PathVariable("bloodGroup") String bloodGroup){
		
		return this.service.getByBloodGroup(bloodGroup);
	}
	

}
