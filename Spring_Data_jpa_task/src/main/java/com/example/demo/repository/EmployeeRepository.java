package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
	
	public List<Employees> getByDateOfBirth(LocalDate date);
	
	public List<Employees> readByLocationAndSkillSet(String location,String skill);
	
	@Query(nativeQuery = true,value="select employee_id,employee_name,DOB,location,employee_skill,phone_number from shree_employee2 where employee_skill=:empskill or location=:loc")
	
	public List<Employees> getBySkillOrLocation(@Param("empskill") String skill,@Param("loc") String location);

	
	public List<Employees> queryByLocation(String loc);
	
	
@Query(nativeQuery = true,value="select employee_id,employee_name,DOB,location,employee_skill,phone_number from shree_employee2 where employee_skill=:empskill and location=:loc")
	
	public List<Employees> getBySkillAndLocation(@Param("empskill") String skill,@Param("loc") String location);
	
}
