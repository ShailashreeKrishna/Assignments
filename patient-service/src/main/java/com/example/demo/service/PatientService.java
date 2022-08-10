package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.PatientDetails;
import com.example.demo.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository repos;
	
	
	
    public List<PatientDetails> findAll(){
		
		return repos.findAll();
	}
	
	public PatientDetails save( PatientDetails entity) {
		
		return repos.save(entity);
	}
	
   public Optional<PatientDetails> findById(int id){
		
		return repos.findById(id);
	}
   

   public List<PatientDetails> getByHospital(String location){
	   
	   return repos.findByHospitalName(location);
   }
   
   
   public PatientDetails[] getByBloodGroup(String bloodGroup){
	   
	   return repos.findByBloodGroup(bloodGroup);
   }
  

}
