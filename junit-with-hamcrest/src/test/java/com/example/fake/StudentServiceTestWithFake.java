package com.example.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.model.Student;
import com.example.service.StudentService;

public class StudentServiceTestWithFake {
 
	@Test
	@DisplayName(value="Test Add Method Return Inserted Object back")
	void testAddMethod() {
		
		
		StudentRepositoryFake fake=new StudentRepositoryFake();
		StudentService service=new StudentService(fake);
		Student shree=new Student(1,"Abi");
		Student actual=service.add(shree);
		assertEquals(actual,shree);
		
	}
	
	@Test
	@DisplayName("Test findAll method return all the element added")
	void testFindAllMethod() {
		StudentRepositoryFake fake=new StudentRepositoryFake();
		StudentService service=new StudentService(fake);
		
		Student ram=new Student(2,"Archu");
		Student shyam=new Student(3,"Bhuvi");
		
		Student one=service.add(ram);
		Student two=service.add(shyam);
        		
		int actual= service.findAll().size();
		int expected=2;
		assertEquals(expected, actual);
	    
		
		
	}
}
