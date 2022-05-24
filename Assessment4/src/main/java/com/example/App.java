package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;


public class App 
{
    public static void main( String[] args )
    {
        Connection con;
        
        try{
        	
        	con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
        	System.out.println(con);
        	
        Services sev=new Services(con); 
			sev.findAll().forEach(System.out::println);
			
			Optional<PopulationDetails> found=sev.findByPlace("KATHMANDU");
			if(found.isPresent()) {
				System.out.println("The Place:"+found.get());
			}else {
				System.out.println("The place is not found");
			}
			
        	
        }catch(SQLException e) {
        	e.printStackTrace();
        }
    }
}
