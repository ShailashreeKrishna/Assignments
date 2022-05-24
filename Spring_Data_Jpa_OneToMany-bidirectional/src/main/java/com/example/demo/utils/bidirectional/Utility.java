package com.example.demo.utils.bidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.repository.bidirectional.DoctorRepository;
import com.example.demo.repository.bidirectional.PatientRepository;

@Component
public class Utility {
	
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repos;
	
	@Autowired
	PatientRepository patientRepo;
	
public void create() {
	
	for(Patient eachPatient: patientList) {
		
		eachPatient.setDoctor(doc);
		
		patientRepo.save(eachPatient);
	}
    	
    	doc.setPatientList(patientList);
    	
    	Doctor added=repos.save(doc);
    	
    	if(added!=null) {
    		
    		System.out.println("One record is added");
    	}
    	
    	
    }
    
    public void findAll() {
    	
    	List<Doctor> doctors=repos.findAll();
    	
    	for(Doctor eachDoctor:doctors) {
    		
    		System.out.println("doctor name:"+eachDoctor.getDoctorName());
    		System.out.println("department:"+eachDoctor.getDepartment());
    		
    		List<Patient> patient=eachDoctor.getPatientList();
    		
    		for(Patient eachPatient:patient) {
    			
    			System.out.println("patient name:"+eachPatient.getPatientName());
    			System.out.println("patient phonenumber:"+eachPatient.getPhoneNumber());
    		}
    	}
    }
	
	public void findDoctorFrmPatient() {
		
		Patient entity = patientRepo.findById(217).get();
		
		System.out.println("Patient Name:"+entity.getPatientName());
		
		System.out.println("Doctor Name:"+entity.getDoctor());
	}
}
