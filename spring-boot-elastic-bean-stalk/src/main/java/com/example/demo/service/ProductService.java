package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.ProductRepository;
import com.example.demo.model.Product;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repos;
	
	public Product add(Product entity) {
		return this.repos.save(entity);
	}
	
	public List<Product> findAll(){
		return this.repos.findAll();
	}
}
