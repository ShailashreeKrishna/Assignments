package com.training.model;

import  java.util.*;
import java.sql.*;
import java.sql.Date;
import java.time.*;

public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	java.util.Date date1=new java.util.Date();
	
	System.out.println(date1);
	System.out.println(date1.getTime());
//	java.sql.Date date2=new java.sql.Date(date1.setTime(234567889));
	java.sql.Date date2=new java.sql.Date(date1.getTime());
	//there is no zero argument constructor in sql.date
	
	System.out.println(date2);
	
	//step:2 UTIL date to SQL date
	java.sql.Date date3=new java.sql.Date(date2.getTime());

	System.out.println(date3);
	
	//step:3 SQL date to LOCALDATE
	
	LocalDate localDate=date3.toLocalDate();
	
	System.out.println(localDate.getDayOfWeek());
	System.out.println(localDate.getMonthValue());
	
	java.sql.Date sqlDate2= java.sql.Date.valueOf(localDate);
	
	System.out.println("SQL Date 2:"+sqlDate2);
	
	}

}
