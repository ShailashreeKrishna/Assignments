package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Shree_doctor")

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Doctor {
    @Id
    @Column(name="Doctor_Id")
	int doctorId;
    
    @Column(name="Doctor_Name")
	String doctorName;
    
    @Column(name="Department")
	String department;
    
    @Column(name="Phone_Number")
	long phoneNumber;
	
}
