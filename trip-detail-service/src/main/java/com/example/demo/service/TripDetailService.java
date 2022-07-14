package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TripDetail;
import com.example.demo.repository.TripDetailRepository;

@Service
public class TripDetailService {

	private TripDetailRepository repos;

	@Autowired
	public TripDetailService(TripDetailRepository repos) {
		super();
		this.repos = repos;
	}
	
	
	public List<TripDetail> findAll(){
		
		return repos.findAll();
	}
	
	public TripDetail save(TripDetail entity) {
		 
		return repos.save(entity);
	}
	
	public List<TripDetail> getById(int id) {
		
		return repos.findByDriverId(id);
	}
	
	public void remove(int id){
		
	Optional<TripDetail> element=repos.findById(id);
	
	if(element.isPresent()) {
		repos.deleteById(id);
	}
	else {
		throw new RuntimeException("detail with"+id+"not found");
	}
	}
}
