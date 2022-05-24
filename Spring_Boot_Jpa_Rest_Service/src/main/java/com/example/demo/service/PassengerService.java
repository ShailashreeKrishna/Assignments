package com.example.demo.service;



import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Passenger;

import com.example.demo.entity.TripHistory;
import com.example.demo.repository.PassengerRepository;

@Service
public class PassengerService {
     
	
	
	PassengerRepository repos;

	@Autowired
	public PassengerService(PassengerRepository repos) {
		super();
		this.repos = repos;
	}
	
	public Passenger add(Passenger entity){
		
		return this.repos.save(entity);
	}
	
	public List<Passenger> getAll(){
		
		return this.repos.findAll();
	}

    public List<Passenger> findByName(String name) {
    	
	return this.repos.findByPassengerName(name);
}

     public List<Passenger> findByDate(LocalDateTime srchdate){
    	 
    	 return this.repos.getByTripListTripDateTime(srchdate);
     }
     
     public int updateLocation(int passengerId,String location) {
    	 
    	 return this.repos.modifyLocation(passengerId, location);
     }
}

