package com.training.services;

import com.training.model.Student;

public class StudentService {

	private Student student;

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentService(Student student) {
		super();
		this.student = student;
	}
	//Applying the Handle Rule of Exception Handling
	public String sendDetails() {
		String name=null;
		try {
		name=this.student.getFirstName();
		} catch (NullPointerException e) {
			System.err.println("Student Object Is not passed check Again");
			// TODO: handle exception
		}
		return name;
		
	}
	//applying the declare rule of exception handling
	public String findRank() throws Exception{
		
		String grade = "A";
		if(this.student.getMarkScored()>90) {
			grade="o";
			
		}
		return grade;
	}
	
}
