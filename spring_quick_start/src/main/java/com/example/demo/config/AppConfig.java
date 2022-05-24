package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration
public class AppConfig {
	
	//Id of the bean as the method name
	@Bean
	public Student ram() {
		return new Student(101,"shree",79);
	}
	
	@Bean
	public Teacher annie() {
		return new Teacher(451,"Lousie","Mathematics");
	}
	
	@Bean
	public Customer customer() {
		return new Customer(201, "shree");
	}
		
	@Bean
		public Product product() {
			return new Product(401, "Laptop");
	}
			
	@Bean
			public Customer rajesh() {
				return new Customer(202, "krish");
			}
	@Bean
	public Customer shyam() {
		return new Customer(203, "Sandy");
	}
				
		}
	


