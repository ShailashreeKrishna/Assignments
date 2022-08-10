package com.example.ifaces;

import java.util.List;


import com.example.model.Professor;

public interface ProfessorRepository {

	public String getQualification();
	
	//for mock
	
	public Professor findByProfessorId(int id);
	
	public int deleteByProfessorId(int id);

	public Professor add(Professor entity);

	public List<Professor> findAll();
	
}
