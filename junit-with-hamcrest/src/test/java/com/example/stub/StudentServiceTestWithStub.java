package com.example.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.service.StudentService;

public class StudentServiceTestWithStub {

	@Test
	@DisplayName("Test findAll method with stub to return all the elements added")
	void testFindAllMethod() {
		
		StudentRepositoryStub stub=new StudentRepositoryStub();
		StudentService service=new StudentService(stub);
		
		assertEquals(2,service.findAll().size());
	}
}
