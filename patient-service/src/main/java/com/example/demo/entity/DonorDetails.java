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
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Entity
@Table(name="shree_donor_details")
public class DonorDetails {
	
	@Id
	@Column(name="donor_id")
	int donorId;
	
	@Column(name="donor_name")
	String donorName;
	
	@Column(name="mobile_number")
	long mobileNumber;
	
	@Column(name="location")
	String location;
	
	
	@Column(name="blood_group")
	String bloodGroup;

}
