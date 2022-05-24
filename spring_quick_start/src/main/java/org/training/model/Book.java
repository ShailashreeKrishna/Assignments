package org.training.model;

import org.springframework.stereotype.Service;

import lombok.ToString;

@Service

public class Book {
	
	
	public double getDiscount(String bookName) {
		return 0.10;
	}

}
