package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CabDriver;
import com.example.demo.repository.CabDriverRepository;


@Service
public class CabDriverService {

	
	
	private CabDriverRepository repos;

	@Autowired
	public CabDriverService(CabDriverRepository repos) {
		super();
		this.repos = repos;
	}
	
	
	public Optional<CabDriver> findById(int id){
		
		return repos.findById(id);
	}
	
	public List<CabDriver> findAll(){
		
		return repos.findAll();
	}
	
	public CabDriver save(CabDriver entity) {
		
		return repos.save(entity);
	}
	
	public void remove(int id) {
		
		Optional<CabDriver> foundElement=repos.findById(id);
		
		if(foundElement.isPresent()) {
			repos.deleteById(id);
		}
		else {
			throw new RuntimeException("Element with"+id+"not found");
		}
	}
	
	public CabDriver getByDriverName(String srchName){
		
		return repos.findByDriverName(srchName);
	}
}
