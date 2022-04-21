package com.training.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dateOfBirth="1995-05-03";
		
		Student vicky=new Student();
		
		vicky.setRollNumber(103);
		vicky.setStudentName("Harsha");
		vicky.setDateOfBirth(LocalDate.parse(dateOfBirth));
		vicky.setDateOfJoining(LocalDateTime.now());
		//to print in month in string
		System.out.println("Month:"+vicky.getDateOfBirth().getMonth());
		
		System.out.println("Year:"+vicky.getDateOfBirth().getYear());
		
		System.out.println("Day:"+vicky.getDateOfBirth().getDayOfMonth());
		//to print month in int
		System.out.println("Month:"+vicky.getDateOfBirth().getMonthValue());
		
		LocalTime startTime=LocalTime.of(9,30);
		
		Duration duration=Duration.of(8, ChronoUnit.HOURS);
		
		//LocalTime endTime=startTime.plus(8,ChronoUnit.HOURS);
		LocalTime endTime=startTime.plusHours(8);//another way to add hour to starttime
		
		System.out.println("Starting Time:"+startTime);
		
		System.out.println("End time:"+endTime);
		

	}

}
