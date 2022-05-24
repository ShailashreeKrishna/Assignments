package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.ifaces.InsuranceRepository;

@Service
public class InsuranceService {

	
	@Autowired
	
	InsuranceRepository repos;
	
	@Autowired
	
	HealthInsurance entity;
	
	@Autowired
	LifeInsurance lifeIns;
	
	public void addHealthPolicy() {
		
		Object obj=repos.save(entity);
		
		Object obj1=repos.save(lifeIns);
		
		if(obj!=null) {
			
			System.out.println("One Record Added");
		}
		
		
		if(obj1!=null) {
			
			System.out.println("One Record Added");
		}
	}
	
	public void getAllPolicy() {
		
		repos.findAll().forEach(System.out::println);
		
	}
	
public void getHealthPolicy() {
		
		repos.findHealthProducts().forEach(System.out::println);
		
	}
	
}
