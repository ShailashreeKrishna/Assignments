package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Shree_patient1")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	
	
	    @Id
	    @Column(name="Patient_Id")
		int patientId;
	    
	    @Column(name="Patient_Name")
		String patientName;
	    
	    
	    @Column(name="Phone_Number")
		long phoneNumber;
	    
}
