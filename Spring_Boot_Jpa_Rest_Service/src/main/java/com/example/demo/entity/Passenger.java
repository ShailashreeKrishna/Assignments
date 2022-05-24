package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name="Shailu_Passenger")
public class Passenger {

	

	

	@Id
	@Column(name="Passenger_Id")
	int passengerId;
	
	@Column(name="Passenger_Name")
	String passengerName;
	
	@Column(name="Email")
	String email;
	
	@Column(name="Location")
	String location;

	 @OneToMany(targetEntity=TripHistory.class,fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	    
	 @JoinColumn(name="Passenger_ref",referencedColumnName = "Passenger_Id")
	 List<TripHistory> tripList;
	 
	
}
