package com.example.mockito.module1;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import java.util.List;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import  static org.mockito.Mockito.*;
import com.example.ifaces.ProfessorRepository;
import com.example.model.Professor;
import com.example.service.ProfessorService;

@ExtendWith(MockitoExtension.class)
public class ProfessorServiceTest {

	@Mock
	ProfessorRepository repos;
	
	@InjectMocks
	ProfessorService service;
	
	@Test
	@DisplayName("checking null or not")
	void testFindAllMethod() {
		
		Professor prof1=new Professor(101,"Krish");
		Professor prof2=new Professor(103,"Santhosh");
		List<Professor> list=new ArrayList<Professor>();
		list.add(prof1);
		list.add(prof2);
		
		assertNotNull(list);      
		
	}
	
	@Test
	@DisplayName("If the matching value not found throw ElementNotFoundException")
	void testFindAllWithCondition() {
		
		Professor prof3=new Professor(104,"Shanmathi");
		Professor prof4=new Professor(105,"Nadhiya");
		
		when(repos.findByProfessorId(104)).thenReturn(prof3);
		
		Professor  actual=service.getByProfessorId(104);
		
		assertEquals(actual,prof3);
		
	}
	
	
	
	@Test
	public void shouldThrowExceptionWhenElementNotFound() {
		
		Professor prof4 = new Professor(302,"priya");
		
		when(repos.findByProfessorId(anyInt())).thenThrow(RuntimeException.class);
		
		assertThrows(RuntimeException.class,()->service.getByProfessorId(890));
		
	}
}
