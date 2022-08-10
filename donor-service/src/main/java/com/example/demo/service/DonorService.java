package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.DonorDetails;
import com.example.demo.repository.DonorRepository;

@Service
public class DonorService {
	
	
	@Autowired
	 private DonorRepository repos;
	
    public List<DonorDetails> findAll(){
		
		return repos.findAll();
	}
	
	public DonorDetails save( DonorDetails entity) {
		
		return repos.save(entity);
	}
	
    public DonorDetails[] findById(int id){
		
		return repos.findByDonorId(id);
	}
    

    public int updateLocation(int donorId,String location) {
   	 
   	 return this.repos.modifyLocation(donorId, location);
    }
    
    
    public void  remove(int id){
		this.repos.deleteById(id);

	}
    
    public DonorDetails[] getByBloodGroup(String bloodGroup){
    	
    	return this.repos.findByBloodGroup(bloodGroup);
    }
    
    public DonorDetails saveOrUpdate(DonorDetails entity) {
		  return this.repos.save(entity);
	  }
}
