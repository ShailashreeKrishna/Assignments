package com.example.service;

import java.util.List;

import com.example.ifaces.ProfessorRepository;
import com.example.ifaces.StudentRepository;
import com.example.model.Student;

public class StudentService {
	
	private StudentRepository repos;
	

	public StudentService(StudentRepository repos) {
		super();
		this.repos = repos;
		
	}


	public Student addWithCondition(Student entity) {
		Student found=null;
	
		if(entity.getRollNumber()>2000) {
			
			this.repos.add(entity);
			found=entity;
		}
		
		return found;
	}
    
	public List<Student> findAll(){
		return this.repos.findAll();
	}
	
	public int findStudentSize() {
		 
		return this.repos.findAll().size();
	}
	
	public Student add(Student entity) {
		return this.repos.add(entity);
				
	}
}
