package com.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;

import com.example.dao.MemberRepository;
import com.example.demo.services.Invoice;
import com.example.demo.services.ProductService;
import com.example.entity.Member;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void member() {
		
	}
	
	//public static void product() {
		  public static void main( String[] args )
		    {
		Connection con = null;
try {
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.107:1521/SIT","HR","HR");
			
			con=ConnectionFactory.getOracleConnection();
			System.out.println(con);
		//con=ConnectionFactory.getPostgresConnection();
		
		ProductService service=new ProductService(con);
		
//		Product toAdd=new Product(402,"WHIRLPOOL",31000);
//		int rowAdded=service.addProduct(toAdd);
//		System.out.println("Row Added:"+rowAdded);
//		
//		service.findAll().forEach(System.out::println);
		
//		Product prod=new Product(207, "Kajal", 450.00);
//		Product jamun=new Product(208, "YAMUNA", 550.00);
		//service.usingTxn(prod,jamun);
		
		Product product=new Product(303, "Kiran", 750.00);
		Invoice invoice=new Invoice(306, "Malar", 4, 192);
		service.usingTxn(product, invoice);
		
	}catch(SQLException e) {
		e.printStackTrace();
		try {
			con.commit();
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
}
	}
   // public static void main( String[] args )
    {
     // product();
    	
    	
//       Connection con;
//		try {
//			
//			con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
//			System.out.println(con);
//			//for connecting oracle
//			con=ConnectionFactory.getOracleConnection();
//			System.out.println(con);
			
			//for connecting postgres
			//con=DriverManager.getConnection("jdbc:postgresql://localhost:5433/test","postgres","root");
			
			//con=ConnectionFactory.getPostgresConnection();
			//System.out.println(con);
			
//			MemberRepository memres=new MemberRepository(con);
//			memres.findAll().forEach(System.out::println);
//			
		// LocalDate date=LocalDate.of(2022,7,15);
		//	Date sqldate = Date.valueOf(date);
			
//			Member list=new Member(301,"SHREE","CHENNAI",LocalDate.of(2022,7,15),"LIFETIME",1000.00,3,199.00);
//		    int valueadded=memres.add(list);
//		    System.out.println("ROW ADDED:"+valueadded);
			
			
//		}catch(SQLException e) {
//			e.printStackTrace();
//	}
		
		
    }
}
