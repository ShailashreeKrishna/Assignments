package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorService {
	
	private DoctorRepository repos;

	
	@Autowired
	public DoctorService(DoctorRepository repos) {
		super();
		this.repos = repos;
	}
	
	public Doctor add(Doctor entity) {
		
		return this.repos.save(entity);
	}
	
	
	public List<Doctor> findAll(){
		
		return this.repos.findAll();
	}
	
	
	public List<Doctor> findByDepartment(String deptString){
		return this.repos.findByDepartment(deptString);
		
	}
	
	public List<Doctor> findByDoctorName(String search){
		return this.repos.findByDoctorName(search);
		
	}
	
	public List<Doctor> findByDoctorNameAndDepartment(String srchName,String srchDept){
		return this.repos.findByDoctorNameAndDepartment(srchName, srchDept);
	}
	
	public List<Doctor> findByNameAndDept(String srch,String Dept){
		return this.repos.getByNameAndDept(srch, Dept);
	}

}
