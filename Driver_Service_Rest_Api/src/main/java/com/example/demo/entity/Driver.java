package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@Entity
@Table(name="Shailu_Driver")
@FieldDefaults(level=AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor

public class Driver {
	@Id
	@Column(name="Id")
	int driverId;
	
	@Column(name="Driver_Name")
	String driverName;
	
	@Column(name="Mobile_Number")
	long mobileNumber;
	
	@Column(name="Rating")
	double rating;



	
}
