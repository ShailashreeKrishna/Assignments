package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.ifaces.ProfessorRepository;
import com.example.model.Professor;


public class ProfessorService {
	
	private ProfessorRepository professorRepos;

	public ProfessorService(ProfessorRepository professorRepos) {
		super();
		this.professorRepos = professorRepos;
	}
	public Professor add(Professor entity) {
		return this.professorRepos.add(entity);
				
	}
	public List<Professor> findAll(){
		
		return this.professorRepos.findAll();
	}
	
	public Professor  getByProfessorId(int id){
        return this.professorRepos.findByProfessorId(id);
	}
   
	
	public int remove(int id) {
		return this.professorRepos.deleteByProfessorId(id);
	}
}
