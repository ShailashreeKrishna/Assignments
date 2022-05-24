package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.repository.SeminarRepository;

@SpringBootApplication
public class SpringDataJpaOneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataJpaOneToOneApplication.class, args);
		
		SeminarRepository repository=context.getBean(SeminarRepository.class);
		
		Seminar sem=context.getBean(Seminar.class);
		
		
        Seminar added=repository.save(sem);
		
		if(added!=null) {
			
			System.out.println("One Record Added");
			
	}	

			repository.findAll().forEach(System.out::println);
		
	}
	
	@Bean
	public Speaker kiran() {
		return new Speaker(411,"Kiran","BCA");
		
	}
	@Bean
	
	public Seminar technical() {
		
		return new Seminar(311,"shree",30,kiran());
	}

	
	
	
//	@Bean
//	public Speaker krish() {
//		return new Speaker(412,"Krithi","BA Tamil");
//		
//	}
	
}
