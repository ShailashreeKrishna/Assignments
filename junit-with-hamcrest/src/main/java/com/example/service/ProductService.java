package com.example.service;

import java.util.Arrays;
import java.util.List;



public class ProductService {
	
	public double findDiscount(String product) {
		
		double discount=0.10;
		if(product.equals("tv")|| product.equals("laptop")) {
			discount=0.20;
		}
		
		return discount;
	}
	
	public List<String> findByProduct(){
		
		List<String> list=Arrays.asList("dell","lenova","asus","hp");
		
		return list;
		
	}
}
	

