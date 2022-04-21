package com.training.model;

import java.time.*;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private LocalDate DateOfBirth;
	private LocalDateTime DateOfJoining;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String studentName, LocalDate dateOfBirth, LocalDateTime dateOfJoining) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		DateOfBirth = dateOfBirth;
		DateOfJoining = dateOfJoining;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public LocalDateTime getDateOfJoining() {
		return DateOfJoining;
	}
	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		DateOfJoining = dateOfJoining;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", DateOfBirth=" + DateOfBirth
				+ ", DateOfJoining=" + DateOfJoining + "]";
	}

	
}
