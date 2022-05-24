package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.controller.PassengerController;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.repository.PassengerRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
@OpenAPIDefinition(info=@Info(title="PASSENGER - API",version="1.0"))
@SpringBootApplication
public class SpringBootJpaRestServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootJpaRestServiceApplication.class, args);
		
	
	}

	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			PassengerRepository repos;
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				
				
				
				TripHistory madurai=new TripHistory(401, LocalDateTime.of(2022, 5, 15, 9, 30),"Chennai","Bangalore", 450.0);
				TripHistory trichy=new TripHistory(402, LocalDateTime.of(2022, 6, 15, 5, 45),"Delhi","Kannyakumari", 750.0);
				TripHistory vellore=new TripHistory(403, LocalDateTime.of(2022, 6, 15, 7, 30),"Pune","Mumbai", 550.0);
				
				List<TripHistory> list=Arrays.asList(madurai,trichy,vellore);
		
				
				Passenger ram=new Passenger();
				ram.setPassengerId(301);
				ram.setPassengerName("Shree");
				ram.setEmail("shree@gmail.com");
				ram.setLocation("Chennai");
				
			
				
				ram.setTripList(list);
				
				repos.save(ram);
				
			
				
			}
		};
	}
}
