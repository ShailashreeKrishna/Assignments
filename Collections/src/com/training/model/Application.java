package com.training.model;

import java.io.ObjectInputStream.GetField;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Application {

	private static final String Doctor = null;

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
		
		//System.out.println(list.toString());
		Doctor D1=new Doctor(104, "Ravi", "Cardiology", list);
		Doctor D2=new Doctor(106, "Shalini", "ENT", list);
		
		
		
		System.out.println(D2.getDoctorName());
		for(Patient names:D1.getPatients()) {
			System.out.println(names);
		}
		
	}
			
		
		
		
	}
		
	


