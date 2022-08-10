package com.example.model;

public class Professor {
	
     private int professorId;
     
     private String professorName;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(int professorId, String professorName) {
		super();
		this.professorId = professorId;
		this.professorName = professorName;
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
     
 
}
