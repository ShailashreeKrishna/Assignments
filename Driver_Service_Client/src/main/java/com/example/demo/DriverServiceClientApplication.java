package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Driver;

@SpringBootApplication
public class DriverServiceClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DriverServiceClientApplication.class, args);
		
		
		Client client=context.getBean(Client.class);
		
		 
		System.out.println(client.invokeGetAll());
//		
//		Driver[] list=client.invokeAllAsObject();
//		
//		for(Driver eachDriver:list) {
//			
//			System.out.println("DRIVER ID: "+eachDriver.getDriverId());
//			
//			System.out.println("DRIVER NAME: "+eachDriver.getDriverName());
//			
//			System.out.println(" MOBILE NUMBER:"+eachDriver.getMobileNumber());
//			
//			System.out.println("RATING: "+eachDriver.getRating());
//		}
		
	//client.add();


		
		context.close();
	}
	@Bean //this line is for security
	
	public BasicAuthenticationInterceptor interceptor() {
		
		return new BasicAuthenticationInterceptor("india", "Krish");
	}
	@Bean
	public RestTemplate template() {
		//return new RestTemplate();
		RestTemplate template=new RestTemplate();
		template.getInterceptors().add(interceptor());
		
		return template;
	}
	
	
}
