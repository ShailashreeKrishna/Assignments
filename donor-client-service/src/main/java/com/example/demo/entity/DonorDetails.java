package com.example.demo.entity;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

public class DonorDetails {
	
	
	int donorId;
	
	
	String donorName;
	
	
	long mobileNumber;
	
	
	String location;
	
	
	
	String bloodGroup;

}
