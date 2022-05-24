package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
	
		
		Doctor siva=ctx.getBean(Doctor.class);
		
		DoctorService service=ctx.getBean(DoctorService.class);
		
        Doctor added=service.add(siva);
		
		if(added!=null) {
			
			System.out.println("One Doctor Added");
			
	}
		
		service.findAll().forEach(System.out::println);
		
		System.out.println("============");
		
		service.findByDepartment("Cardiology").forEach(System.out::println);
		
		System.out.println("=============");
		
		service.findByDoctorName("Kiran").forEach(System.out::println);
		
		System.out.println("==============");
		
		service.findByDoctorNameAndDepartment("Shree", "Cardiology").forEach(System.out::println);
		
		System.out.println("===============");
	
		service.findByNameAndDept("Kiran","ENT").forEach(System.out::println);
	     ctx.close();
	
	}
	
	@Bean
	public Doctor krish() {
		return new Doctor(203,"Shree","Cardiology",97843764332L);
	}
	
	

}
