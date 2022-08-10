package com.example.model;

public class Student {
	
	private int rollNumber;
	private String StudentName;
	public Student() {
		super();

	}
	
	public Student(int rollNumber, String studentName) {
		super();
		this.rollNumber = rollNumber;
		StudentName = studentName;
	}
	
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

}
