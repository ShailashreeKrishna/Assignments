package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.Insurance;
import com.example.demo.entity.LifeInsurance;

public interface InsuranceRepository<T extends Insurance> extends JpaRepository<T, Integer> {
	
	@Query("from LifeInsurance")
	
	public List<LifeInsurance> getLifePolicy();
	
@Query("from HealthInsurance")
	
	public List<HealthInsurance> getHealthPolicy();


}
