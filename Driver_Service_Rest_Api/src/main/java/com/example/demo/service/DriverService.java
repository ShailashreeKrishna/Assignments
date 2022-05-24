package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.example.demo.entity.Driver;
import com.example.demo.repository.DriverRepository;

@Service
public class DriverService {
	
	
	private DriverRepository repos;

	@Autowired
	public DriverService(DriverRepository repos) {
		super();
		this.repos = repos;
	}

	public List<Driver> findAll() {
		// TODO Auto-generated method stub
		return this.repos.findAll();
	}

	public Driver add(Driver entity) {
		// TODO Auto-generated method stub
		return this.repos.save(entity);
	}
	
	public Driver findById(int id) {
		
		return this.repos.findById(id).orElseThrow(()->new RuntimeException(id+" "+"NOT FOUND"));
	}

	
	public Driver remove(Driver entity) {
		boolean result=this.repos.existsById(entity.getDriverId());
		if(result) {
		this.repos.delete(entity);
		}else {
			throw new NoSuchElementException("element with Id ="+entity.getDriverId()+"Not Present");
		}
		return entity;
		}

	
	public List<Driver> findByDriverName(String srchName){
		return this.repos.findByDriverName(srchName);
	}

	
	public List<Driver> srchByMobileNumber(long number){
		return this.repos.findByMobileNumber(number);
	}
	
	
	public List<Driver> srchByDriverRating(double rating){
		return this.repos.searchByRating(rating);
	}
	
	public int updateRating(int id,double rating) {
		return this.repos.modifyRating(id, rating);
	}
	
	public List<Driver> sortedList(String propName){
		return this.repos.findAll(Sort.by(propName));
	}
}

