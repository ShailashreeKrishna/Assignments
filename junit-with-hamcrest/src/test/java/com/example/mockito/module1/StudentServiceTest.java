package com.example.mockito.module1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import  static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.ifaces.StudentRepository;
import com.example.model.Student;
import com.example.service.StudentService;
@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
	
//	@Test //without annotation
//	@DisplayName("Test FindAll method with Mockito Stub")
//	void testFindAll() {
//		
//		StudentRepository studRepos=mock(StudentRepository.class);
//		
//		StudentService service= new StudentService(studRepos);
//		
//	  //stubbing
//		Student one=new Student(1,"Abi");
//		Student two=new Student(2,"Anand");
//		List<Student> list=new ArrayList<Student>();
//		list.add(one);
//		list.add(two);
//		
//		when(studRepos.findAll()).thenReturn(list);
//		
//		assertEquals(service.findStudentSize(), 2);
//	}
//	
	
	
	@Mock
	StudentRepository repos;
	
	 @InjectMocks
	 StudentService service;
	 @Test
		@DisplayName("Test FindAll method with Mockito Stub")
		void testFindAllWithAnnotation() {
		
		  //stubbing
			Student one=new Student(1,"Abi");
			Student two=new Student(2,"Anand");
			List<Student> list=new ArrayList<Student>();
			list.add(one);
			list.add(two);
			
			when(repos.findAll()).thenReturn(list);
			
			assertEquals(service.findStudentSize(), 2);
		}
	 
	 @DisplayName("Test AddMethodWithCondition of the service it should add elements one if the"
				+ "roll number is greater than 2000 else it should return a null value")
		@Test
		void testFindAddMethod() {
		
		 Student student1=new Student(2002,"Bhuvi");
		 
		 assertNotNull(service.addWithCondition(student1));
		 
	 }	
	 @Mock
	 StudentService serviceMock;
	 
	 @Test
	 void verifyAddMethod() {
		 Student student2=new Student(2002,"Bhuvi");
		 
		 serviceMock.addWithCondition(student2);
		 
		 verify(serviceMock,times(1)).addWithCondition(student2);
	 }
}
