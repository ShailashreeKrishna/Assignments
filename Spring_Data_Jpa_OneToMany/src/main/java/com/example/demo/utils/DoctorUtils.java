package com.example.demo.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.repository.DoctorRepository;

@Component

public class DoctorUtils {
	
	
    @Autowired
	List<Patient> patientList;
    
    @Autowired
    Doctor doc;
    
    @Autowired
    DoctorRepository repo;
    
    public void create() {
    	
    	doc.setPatientList(patientList);
    	
    	Doctor added=repo.save(doc);
    	
    	if(added!=null) {
    		
    		System.out.println("One record is added");
    	}
    	
    	
    }
    
    public void findAll() {
    	
    	List<Doctor> doctor=repo.findAll();
    	
    	for(Doctor eachDoctor:doctor) {
    		
    		System.out.println(eachDoctor.getDoctorName());
    		System.out.println(eachDoctor.getDepartment());
    		
    		List<Patient> patient=eachDoctor.getPatientList();
    		
    		for(Patient eachPatient:patient) {
    			
    			System.out.println(eachPatient.getPatientName());
    			System.out.println(eachPatient.getPhoneNumber());
    		}
    	}
    }
}
