package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	

	public List<Doctor> findByDepartment(String dept);
	
	public List<Doctor> findByDoctorName(String srch);
	
	public List<Doctor> findByDoctorNameAndDepartment(String docName,String dept);
	
	@Query(nativeQuery = true,value="select doctor_id,doctor_name,department,phone_number from shree_doctor where doctor_name=:docName or department=:dept")
	
	public List<Doctor> getByNameAndDept(@Param("docName") String docName,@Param("dept") String dept);
}
