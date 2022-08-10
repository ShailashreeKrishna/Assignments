package com.example.dummy.service;

import java.util.List;

import com.example.ifaces.ProfessorRepository;
import com.example.ifaces.StudentRepository;
import com.example.model.Student;

public class DummyStudentService {
	
	private StudentRepository studRepos;
	
	private ProfessorRepository profRepos;

	public DummyStudentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DummyStudentService(StudentRepository studRepos, ProfessorRepository profRepos) {
		super();
		this.studRepos = studRepos;
		this.profRepos = profRepos;
	}
	
	public Student add(Student entity) {
		return this.studRepos.add(entity);
	}
    
	public List<Student> findAll(){
		return this.studRepos.findAll();
	}

}
