package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;





public class Services implements CrudRepository<PopulationDetails> {

	private Connection con;
	
	public Services(Connection con) {
		super();
		this.con = con;
	}

	public List<PopulationDetails> findAll() {
		// TODO Auto-generated method stub
		List<PopulationDetails> populationList=new ArrayList<PopulationDetails>();
		
		String sql="select * from SHDETAILS";
		
		
		try(PreparedStatement detstat=con.prepareStatement(sql))
			{
			
			ResultSet rs=detstat.executeQuery();
			
			
			while(rs.next()) {
				
				String countryName=rs.getString("COUNTRY");
				String place=rs.getString("PLACE");
				Long population=rs.getLong("POPULATION");
				
				
				
				PopulationDetails list=new PopulationDetails(countryName, place, population);
				 
				populationList.add(list);
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		
		
		return populationList;
		
		
	}

	public Optional<PopulationDetails> findByPlace(String place1) {
		// TODO Auto-generated method stub
		Optional<PopulationDetails> obj=Optional.empty();
		String sql="SELECT PLACE FROM SHDETAILS WHERE COUNTRY=(?)";
try(PreparedStatement detstat=con.prepareStatement(sql)){
			
			detstat.setString(2,"place");
			
			ResultSet rs=detstat.executeQuery();
			
			if(rs.next()) {
				
				String countryName=rs.getString("COUNTRY");
				String place=rs.getString("PLACE");
				Long population=rs.getLong("POPULATION");
				
				PopulationDetails list=new PopulationDetails(countryName, place, population);
				 
				obj=Optional.of(list);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return obj;
		
		
	}

	public List<PopulationDetails> getCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
