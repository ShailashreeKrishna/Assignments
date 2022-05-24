package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

@AllArgsConstructor
@NoArgsConstructor

public class DriverDTO {

	int driverId;
	
	
	String driverName;
	

	long mobileNumber;
	

	double rating;
}