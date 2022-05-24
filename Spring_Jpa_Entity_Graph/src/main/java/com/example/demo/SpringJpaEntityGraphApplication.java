package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;
import com.example.demo.entity.User;
import com.example.demo.repository.AddressRepository;
import com.example.demo.service.AddressService;

@SpringBootApplication
public class SpringJpaEntityGraphApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringJpaEntityGraphApplication.class, args);
		
		AddressService service=context.getBean(AddressService.class);
		
		service.task2();
		
		context.close();
	}

	
	
	
	@Bean
	public CommandLineRunner runner() {//interface cannot be instantiate
		
		//we provided a anoymouns class-this class implemented in between open and close paranthesis and semicolon
		return new CommandLineRunner() {
			
			
			@Autowired
			
			AddressRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				City chennai=new City(311,"Chennai");
				
				City bangalore=new City(312,"Bangalore");
				
				City madurai=new City(313,"Madurai");
				
				User krish=new User(411,"Shree",456456);
				
				User ram= new User(412,"Kiran",5634534);
				
				User shyam=new User(413,"Santhosh",7898453);
				
				Address address1=new Address(501,"Mr.",chennai,krish);
				
				Address address2=new Address(502,"Dr.",bangalore,ram);
				
				Address address3=new Address(503,"Ms.",madurai,shyam);
				
				this.repo.save(address1);
				
				this.repo.save(address2);
				
				this.repo.save(address3);
				
				
			}
		};
		
	}
}
