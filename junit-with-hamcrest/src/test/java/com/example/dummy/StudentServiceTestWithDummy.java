package com.example.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.dummy.service.DummyStudentService;
import com.example.fake.StudentRepositoryFake;
import com.example.model.Student;


public class StudentServiceTestWithDummy {

	
	@Test
	@DisplayName(value="Test Add Method Return Inserted Object back")
	void testAddMethod() {
		
		
		StudentRepositoryFake fake=new StudentRepositoryFake();
		
		DummyProfessorRepository dummy=new DummyProfessorRepository();
		
		DummyStudentService service=new DummyStudentService(fake,dummy);
		
		Student shree=new Student(1,"Abi");
		
		Student actual=service.add(shree);
		
		assertEquals(actual,shree);
		
	}
	
}
