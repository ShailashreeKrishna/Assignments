package com.example.demo;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.utils.bidirectional.Utility;

@SpringBootApplication
public class SpringDataJpaOneToManyBidirectionalApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataJpaOneToManyBidirectionalApplication.class, args);
		
		Utility utils=context.getBean(Utility.class);
		
		System.out.println("================");
		utils.create();
		
		System.out.println("================");
		utils.findAll(); 
		
		System.out.println("================");
		utils.findDoctorFrmPatient();
		
		context.close();
	}
	
	
	@Bean
	public Doctor saranya() {
		 Doctor doc=new Doctor();
		 doc.setDoctorId(117);
		 doc.setDoctorName("Suganya");
		 doc.setDepartment("Paediatricisan");
		 doc.setPhoneNumber(9576246723L);
		 return doc;
	}
	
	@Bean
	public Patient kavi() {
		
		return new Patient(215,"Savitha",56834893L);
		
		
	}
	
	@Bean
	public Patient kalai() {
		
		return new Patient(216,"Pavin",88984225L);
	}
	
	@Bean
	public Patient sandy() {
		
		return new Patient(217,"Santhosh",78994335L);
}

}
