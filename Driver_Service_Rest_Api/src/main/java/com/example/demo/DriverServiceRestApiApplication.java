package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.controller.DriverController;
import com.example.demo.entity.Driver;
import com.example.demo.repository.DriverRepository;
import com.example.demo.service.DriverService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="Driver Service -API",version="1.0"))
public class DriverServiceRestApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DriverServiceRestApiApplication.class, args);
		
		DriverService service=context.getBean(DriverService.class);
		
		DriverController controller=context.getBean(DriverController.class);
		
		System.out.println("All Drivers:"+controller.getAllDrivers());
		
      System.out.println("row updated:"+controller.updateRating(420, 5.0));
		
		
	}

	
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			DriverRepository repos;
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				
				repos.save(new Driver(420,"Bhuvi",34694829,4.0));
				
				
			}
		};
	}
}
