package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.service.InsuranceService;

@SpringBootApplication
public class SpringTablePerSubClassApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringTablePerSubClassApplication.class, args);
		
		
		InsuranceService service=context.getBean(InsuranceService.class);
		
		service.addHealthPolicy();
		
         service.getHealthPolicy();
		
		
		context.close();
	}

	
	@Bean
	public LifeInsurance  life() {
		
		
		return new LifeInsurance(784,"Joseph",23,"it services");
	}
	
	@Bean
	
	public HealthInsurance health() {
		
		return new HealthInsurance(684,"Manasha",56,"Diabeties");
	}
}
