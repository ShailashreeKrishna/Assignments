package com.example.demo;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employees;
import com.example.demo.services.EmployeeService;

@SpringBootApplication
public class SpringDataJpaTaskApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(SpringDataJpaTaskApplication.class, args);
	
	Employees emp=context.getBean(Employees.class);
	
	EmployeeService service=context.getBean(EmployeeService.class);
	
	 Employees added=service.add(emp);
	if(added!=null) {
		
		System.out.println("One Employee Added");
		
}
	System.out.println("============");
	System.out.println("Overall Table Content");
	service.findAll().forEach(System.out::println);
	
	System.out.println("=============");
	System.out.println("Date Result");
	service.findByDate(LocalDate.of(2001, 9, 03)).forEach(System.out::println);
	
	System.out.println("==============");
	System.out.println("Location and Skillset result");
	service.findByLocAndSkill("Chennai", "Decision Making").forEach(System.out::println);
	
	System.out.println("==============");
	System.out.println("Skillset result");
	service.findBySkill("SQL","Bangalore").forEach(System.out::println);
	
	System.out.println("===============");
	System.out.println("location result");
	service.findByLocation("Mumbai").forEach(System.out::println);
	

	System.out.println("==============");
	System.out.println("Using Query Location and SkillSet Result");
	service.findBySkillAndLocation("Problem Solving", "Bangalore").forEach(System.out::println);
	context.close();
	}
	
	
	@Bean
	public Employees ram() {
		return new Employees(304,"Shree",LocalDate.of(2001,7,15),"Chennai","Decision Making",83100477434L);
	}

}
