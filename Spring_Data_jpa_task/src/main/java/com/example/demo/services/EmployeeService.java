package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employees;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private EmployeeRepository empRepos;

	@Autowired
	public EmployeeService(EmployeeRepository empRepos) {
		super();
		this.empRepos = empRepos;
	}
	
	public Employees add(Employees value){
		return this.empRepos.save(value);
	}
	
	public List<Employees> findAll(){
		return   this.empRepos.findAll();
	}
	
	public List<Employees> findByDate(LocalDate srch){
		return this.empRepos.getByDateOfBirth(srch);
	}
	
	public List<Employees> findByLocAndSkill(String srchLoc,String srchSkill){
		return this.empRepos.readByLocationAndSkillSet(srchLoc, srchSkill);
	}
	
	public List<Employees> findBySkill(String skillSet,String schLoc){
		
		return this.empRepos.getBySkillOrLocation(skillSet,schLoc);
	}

	public List<Employees> findByLocation(String srchLoc){
		
		return this.empRepos.queryByLocation(srchLoc);
	}
	
public List<Employees> findBySkillAndLocation(String skillSet,String schLoc){
		
		return this.empRepos.getBySkillAndLocation(skillSet,schLoc);
	}

}
