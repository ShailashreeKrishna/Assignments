package com.example.demo;

import com.example.demo.entity.Product;
import com.example.demo.repos.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;


@SpringBootApplication

public class SpringJdbcApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringJdbcApplication.class, args);
	
	ProductRepository repo=context.getBean(ProductRepository.class);
	
//	Product tv=context.getBean(Product.class);
//	System.out.println("Row Added:"+repo.add(tv));
//	repo.findAll().forEach(System.out::println);
//	System.out.println("==============");
//	System.out.println("result:"+repo.findById(197));
	
	System.out.println("============");
	Product mixer=context.getBean(Product.class);
	//System.out.println(mixer);
	System.out.println("Updated:"+repo.update(mixer));
	
	System.out.println("==============");
	System.out.println("Deleted:"+repo.remove(191));
	
//Product prod=context.getBean(Product.class);
//System.out.println("row updated:"+repo.findById1(303));

	((ConfigurableApplicationContext) context).close();
	}
	
//	@Bean
//	public Product tv() {
//		return new Product(450,"RAM",450);
//	}
	@Bean
	@Primary
	public Product mixer() {
		return new Product(303,"others",999);
	}

}
