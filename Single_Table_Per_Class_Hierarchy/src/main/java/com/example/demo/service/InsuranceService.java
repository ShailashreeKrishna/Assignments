package com.example.demo.service;

import java.util.List;

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
	
	public void findAll() {
		
		repos.findAll().forEach(System.out::println);
	}
	
	
	public void findLife(){
		
		 repos.getLifePolicy().forEach(System.out::println);
	}
	
	public void findHealth(){
		
		 repos.getHealthPolicy().forEach(System.out::println);
	}
}
