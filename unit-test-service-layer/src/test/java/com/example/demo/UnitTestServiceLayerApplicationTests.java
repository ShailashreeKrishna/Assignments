package com.example.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.service.CabDriverService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class UnitTestServiceLayerApplicationTests {
  
	@Autowired
	CabDriverService service;
	
	@BeforeAll
	void setUp() {
		//CabDriver driver= new CabDriver(11,"Shree",473893743L,"chennai",LocalDate.of(2000, 10, 13),4.5);
		//change the name because we expected bhuvi here i wrote shree instead of bhuvi
		CabDriver driver= new CabDriver(11,"Bhuvi",473893743L,"chennai",LocalDate.of(2000, 10, 13),4.5);
		service.save(driver);
	}
	
//	@Test
//	@DisplayName("FindAll Method should return a empty array")
//	void testFindAll() {
//		
//		assertTrue(service.findAll().isEmpty());
//	}
	
	@Test
	@DisplayName("FindAll method should return An array with values")
	void tesFindAllSuccess() {
		assertFalse(service.findAll().isEmpty());
	}
	
	@Test
	@DisplayName("FindById method should return an element with the given Id")
	void testFindById() {
		
		assertEquals("Bhuvi",service.findById(11).get().getDriverName());
	}

	@Test
	@DisplayName("FindById method should return an element with the given Id or else throw exception")
	void testFindByIdThrow() {
		
		CabDriver driver=service.findById(12).orElseThrow(EntityNotFoundException::new);
		
		assertEquals("Bhuvi",driver.getDriverName());
	}
	
}
