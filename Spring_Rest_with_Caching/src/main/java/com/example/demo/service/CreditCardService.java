package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CreditCard;
import com.example.demo.repository.CreditCardRepository;

@Service
public class CreditCardService {
	
	private CreditCardRepository repos;

	@Autowired
	public CreditCardService(CreditCardRepository repos) {
		super();
		this.repos = repos;
	}
	
 @Cacheable("cards")
	public List<CreditCard> getAll(){
		return this.repos.findAll();
	}
	@Cacheable(value="card",key="#cardNumber")
	public CreditCard getById(long cardNumber) {
		return this.repos.findById(cardNumber)
				.orElseThrow(()->new RuntimeException("Not Found"));
	}
	@CachePut(value="card",key="#entity.cardNumber")//it put element in cache
	public CreditCard addCard(CreditCard entity) {
		return this.repos.save(entity);
	}
	
//	@CacheEvict(value="card",key="#entity.cardNumber")
//	
//	public void remove(CreditCard entity) {
//		
//		this.repos.deleteById(entity.getCardNumber());
//	}
	
	@CacheEvict(value = "card",key = "#entity.cardNumber")
	public void remove(CreditCard entity) {
		this.repos.deleteById(entity.getCardNumber());
		
		
	}
}
