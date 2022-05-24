package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository repo;
	
	public void task() {
		
		List<Address> addressList=repo.findAll();
		
		for(Address eachAddress:addressList) {
			
			System.out.println("Title:"+eachAddress.getTitle());
			System.out.println("City:"+eachAddress.getCity());
			System.out.println("User:"+eachAddress.getUser());
		}
	}
	
public void task2() {
		
		List<Address> addressList=repo.findAll();
		
		for(Address eachAddress:addressList) {
			
			System.out.println("Title:"+eachAddress.getTitle());
			//System.out.println("City:"+eachAddress.getCity());
			System.out.println("User:"+eachAddress.getUser());
		}
	}
}
