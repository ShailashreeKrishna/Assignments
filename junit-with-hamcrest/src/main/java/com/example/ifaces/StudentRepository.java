package com.example.ifaces;

import java.util.List;

import com.example.model.Student;

public interface StudentRepository {
	
	public Student add(Student entity);
	public List<Student> findAll();
	//for mock we use this method
	public Student addWithCondition(Student entity);
	
    

}
