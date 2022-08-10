package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PatientDetails;

public interface PatientRepository extends JpaRepository<PatientDetails, Integer> {
	

	 List<PatientDetails> findByHospitalName(String location);
	
	 PatientDetails[] findByBloodGroup(String bloodGroup);
}
