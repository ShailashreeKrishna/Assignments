package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;


@SpringBootApplication
public class SpringDataJpaOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOneToManyApplication.class, args);
		
		DoctorUtils obj=ctx.getBean(DoctorUtils.class);
				
				obj.create();
				
				obj.findAll();
				
				
				
		
		ctx.close();
	}

	
	@Bean
	public Doctor saranya() {
		 Doctor doc=new Doctor();
		 doc.setDoctorId(115);
		 doc.setDoctorName("Swetha");
		 doc.setDepartment("Dentist");
		 doc.setPhoneNumber(9576246723L);
		 return doc;
	}
	
	@Bean
	public Patient kavi() {
		
		return new Patient(213,"Kavitha",46834893L);
		
		
	}
	
	@Bean
	public Patient kalai() {
		
		return new Patient(214,"Kavin",78984225L);
	}
	
	@Bean
	public Patient sandy() {
		
		return new Patient(215,"Mughin",78984335L);
}
}
