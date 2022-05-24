package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.service.InsuranceService;

@SpringBootApplication
public class SingleTablePerClassHierarchyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SingleTablePerClassHierarchyApplication.class, args);
		
		InsuranceService service=context.getBean(InsuranceService.class);
		
		System.out.println("==============");
		service.addHealthPolicy();
		
		System.out.println("==============");
		service.findAll();
		
		System.out.println("==============");
		service.findHealth();
		
		System.out.println("==============");
		service.findLife();
	}

	@Bean
	public LifeInsurance  life() {
		
		
		return new LifeInsurance(784,"Joseph",23,"IT services");
	}
	
	@Bean
	
	public HealthInsurance health() {
		
		return new HealthInsurance(684,"Manasha",56,"Diabeties");
	}
}
