package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Shailu_Trip_History")
public class TripHistory {

	@Id
	@Column(name="Trip_Id")
	int tripId;
	
	@Column(name="Date_And_Time")
	@DateTimeFormat(iso=ISO.DATE_TIME)
	LocalDateTime tripDateTime;
	
	@Column(name="Boarding")
	String startingPoint;
	
	@Column(name="Destination")
	String destination;
	
	@Column(name="Amount")
	double amount;
}
