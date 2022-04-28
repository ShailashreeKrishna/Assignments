package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.ProductService;
import com.example.entity.Product;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con;
		try {
			
			con=DriverManager.getConnection("Jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			System.out.println(con);
			
			ProductService service=new ProductService(con);
			
			Product toAdd=new Product(209,"Mobile",21000.00);
			int rowAdded=service.addProduct(toAdd);
			
			int rowsDeleted=service.deleteById(193);
			System.out.println("Row deleted:"+rowsDeleted);
			
			System.out.println("Row Added:"+rowAdded);
			
			int rowsUpdated=service.update("laptop", 17000 );
			System.out.println("Row updated:"+rowsUpdated);
			
			service.findAll().forEach(System.out::println);
			
			Optional<Product> found=service.findById(197);
			
			if(found.isPresent()) {
				System.out.println(found.get());;
			}else {
				System.out.println("product is not found");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
