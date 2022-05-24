package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Entity
@Table(name="shree_employee2")

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Employees {
	@Id
	@Column(name="Employee_Id")
	int employeeId;
    
	@Column(name="Employee_Name")
	String employeeName;
	
//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
   @Column(name="DOB")
     LocalDate dateOfBirth;
    
    @Column(name="Location")
    String location;
    
    @Column(name="Employee_Skill")
    String skillSet;
    
    @Column(name="Phone_Number")
    long phoneNumber;
    

	

}
