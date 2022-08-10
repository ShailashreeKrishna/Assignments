package org.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreetingTest {
	
	@Test
	@DisplayName(value="Test the Get Message return a string of Length 8 characters")
	//sometimes we does not able to define the method name in such case we use this type
	
	void testMaxLength() {
	
		Greeting obj=new Greeting();
		
		int actual=obj.getMessage().length();
		
		int expected =5;
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName(value="Test the birthday wish method does not return null")

	
	void testBirthDayWish() {
	
		Greeting grtobj=new Greeting();
		
		String actual=grtobj.getBirthDayWish("Shree");
		
	   assertNotNull(actual);
	   // assertNull(actual);
	}
	
	@Test
	@DisplayName(value="Test BirthDay Wish Method Should return Happy Birthday with username suffixed")
	
	void testBirthDayWish1() {
		
		Greeting wish=new Greeting();
		
		String solution=wish.getBirthDayWish("Shree");
		
		String expected="Happy BirthdayShree";
				
		assertEquals(expected, solution);
			
	}
	

}
