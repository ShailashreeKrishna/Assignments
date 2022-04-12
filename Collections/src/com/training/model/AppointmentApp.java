package com.training.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AppointmentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient patient1=new Patient(01, "Shree", "Chennai", 7893930046L);
		Patient patient2=new Patient(02, "krish", "Bangalore", 7893931008L);
		Patient patient3=new Patient(03, "Harsha", "Mumbai", 4567831008L);
		Patient patient4=new Patient(04, "Anu", "Cochin", 4567835608L);
		
		Set<Patient> list=new HashSet<>();
		list.add(patient1);
		list.add(patient2);
		list.add(patient3);
		list.add(patient4);
		Doctor D1=new Doctor(104, "Ravi", "Cardiology", list);
		Doctor D2=new Doctor(106, "Shalini", "ENT", list);
		
//  Doctor ravi=new Doctor();
//  Doctor shalini=new Doctor();
  Set<Doctor> patient=new HashSet<>();
  patient.add(D1);
  patient.add(D2);
  Map<Doctor,Set<Patient>> map=new HashMap<>();
  Appointment  appointment=new Appointment();
  map.put(D2, list);
  System.out.println(map.get(D2));
   


  
	}

}
