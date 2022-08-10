package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Product;

@SpringBootApplication
public class SpringBootElasticBeanStalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElasticBeanStalkApplication.class, args);
	}
	
	@Bean
	public Product tv() {
		return new Product(301,"Sony tv",793.0);
	}
	
	@Bean
	public Product printer() {
		return new Product(301,"Canon Printer",789.0);
	}
	
//the url in application.yml must be taken from aws endpoint after creating database
	//choose rds service for creating database
	//change application.properties to application.yml when we add jpa and postgress
	//add spring datasoure after creating database 
	//put the password while created in aws database
	//before that there only a application.properties which consist only server.port
}
