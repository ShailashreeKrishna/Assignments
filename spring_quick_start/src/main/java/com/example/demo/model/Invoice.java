package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data

@Component

public class Invoice {

	
	Customer customer;
	Product product;
	
	@Autowired 
	public Invoice(@Qualifier("rajesh")Customer customer, Product product) {
		super();
		
		System.out.println("Constructor called====");
		this.customer = customer;
		this.product = product;
	}
	
	
	
}
