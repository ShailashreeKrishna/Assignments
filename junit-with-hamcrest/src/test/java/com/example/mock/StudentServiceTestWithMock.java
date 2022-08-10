package com.example.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.model.Student;
import com.example.service.StudentService;

public class StudentServiceTestWithMock {

	@DisplayName(value="Test Verify Add Method with Mock")
	@Test
	void testAddMethod() {
		StudentServicemock mock=new StudentServicemock();
		
		StudentService service=new StudentService(mock);
		
		Student one=new Student(92,"Kalai");
		
		Student two=new Student(32,"Anu");
		
		service.add(one);
		service.add(two);
		
		//mock.verify(one, 2);//it is not allowed 
		mock.verify(two, 2);
	}
}
