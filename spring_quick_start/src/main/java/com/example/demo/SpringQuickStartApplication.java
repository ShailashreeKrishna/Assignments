package com.example.demo;

import org.training.model.*;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;


@ComponentScan(basePackages= {"org.training","com.example"})
@SpringBootApplication //entry point
public class SpringQuickStartApplication {

	
		public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringQuickStartApplication.class, args);
		
		//when using id need to cast to specific bean since return type of getBean method is object
		System.out.println(ctx.getBean("ram"));
		//it print null for teacher attribute because it is zero arg constructor
		//System.out.println(ctx.getBean("teacher"));//casting not required,but there should be 
		//only one bean of that type will throw exception
		
		//to get value
		Teacher viji=ctx.getBean("annie",Teacher.class);
		viji.setId(450);
		viji.setName("Preethi");
		viji.setSubject("POM");
		System.out.println(viji);
	
		
	
	//when more than one bean of the same type available = should use id and class name}
		
		
			//It is for  invoice method
			Invoice invoice=ctx.getBean(Invoice.class);
			System.out.println(invoice);
			
			Bill bill=ctx.getBean(Bill.class);
			System.out.println("Customer:"+bill.getCustomer());
			System.out.println("Product:"+bill.getProduct());
			
			CustomerList list=ctx.getBean(CustomerList.class);
			System.out.println(list);
			
			System.out.println(ctx.getBean(Book.class) );
			
			System.out.println(ctx.getBean(Author.class));
			
		
	}
		
		@Bean
		public Author rabindranath() {
			return new Author(101,"shree");
		}

		@Bean
		@Primary //another method to get author detail what we want
		//or otherwise pass id to syso method
		public Author Tagore() {
			return new Author(201,"Krish");
		}

}
