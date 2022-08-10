package com.example.stub;

import java.util.Arrays;
import java.util.List;

import com.example.ifaces.StudentRepository;
import com.example.model.Student;

public class StudentRepositoryStub implements StudentRepository {

	@Override
	public Student add(Student entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return Arrays.asList(new Student(2,"Archu"),new Student(3,"Bhuvi"));
	}

	@Override
	public Student addWithCondition(Student entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
