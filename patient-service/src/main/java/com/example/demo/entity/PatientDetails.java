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
@Table(name="shree_patient_details")
public class PatientDetails {

	@Id
	@Column(name="patient_id")
	int patientId;
	
	@Column(name="patient_name")
	String patientName;
	
	@Column(name="hospital_name")
	String hospitalName;
	
	@Column(name="address")
	String address;
	
	@Column(name="mobile_number")
	long mobileNumber;
	
	@Column(name="blood_group")
	String bloodGroup;
	
	
}
