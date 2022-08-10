package com.example.fake;

import java.util.ArrayList;
import java.util.List;

import com.example.ifaces.StudentRepository;
import com.example.model.Student;

public class StudentRepositoryFake implements StudentRepository {

	 private List<Student> list;
	 
	 
	public StudentRepositoryFake() {
		super();
		list=new ArrayList<>();
	}

	@Override
	public Student add(Student entity) {
		// TODO Auto-generated method stub
		return list.add(entity)?entity:null;
	}

	@Override
	public List<Student> findAll() {
		
		return this.list;
	}

	@Override
	public Student addWithCondition(Student entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
