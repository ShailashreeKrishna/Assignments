package com.training.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ram=new Student(101,"Shree", LocalDate.of(2000, 03, 03),
				LocalDateTime.of(2005, Month.JUNE,5,6,30));
		Student shyam=new Student(102,"Krish", LocalDate.now(), LocalDateTime.now());
		
		System.out.println("Rams Year Of Birth:"+ram.getDateOfBirth().getMonth());
		
		System.out.println("Rams First Birthday:"+ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));
		
		System.out.println("Shyams Year Of Birth:"+shyam.getDateOfBirth().getYear());
		
		System.out.println("Shyams Sixtyth Birthay:"+shyam.getDateOfBirth().plus(60,ChronoUnit.YEARS));
	}

}
