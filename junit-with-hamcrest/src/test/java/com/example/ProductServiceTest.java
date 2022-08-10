package com.example;


import org.hamcrest.Matcher;
import org.hamcrest.collection.HasItemInArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.example.service.ProductService;

import static org.hamcrest.MatcherAssert.assertThat;

public class ProductServiceTest {
	
	
	ProductService service=null;
	@BeforeEach
	void init() {
		service=new ProductService();
	}
	
   @Test
   @DisplayName(value="Test findDiscount method returns 0.20 or above for tv and laptops")
   
   void testDiscount() {
	   
	   double actual=service.findDiscount("laptop");
	   
	   assertThat(actual,is(greaterThan(0.19)));
   }
   
   @DisplayName(value="Test findDiscount method return 0.10 or above for fridge,washingmachine")
   @Test
   
   void testFindDiscountCaseTwo() {
	   
	   double actual=service.findDiscount("fridge");
	   
	   assertThat(actual,equalTo(0.10));
   }
   
   @DisplayName(value="Test findProduct method returns a  list of four brands")
   @Test
   void testFindDiscountListProduct() {
	    
	int actual=service.findByProduct().size();
	int expected=4;
	
	assertThat(actual,is(equalTo(expected)));
			
         
   }


}
