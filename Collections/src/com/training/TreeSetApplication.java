package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Student;

public class TreeSetApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram=new Student(101, "Shree", 90);
		Student shyam=new Student(102, "Kiran", 96);
		Student magesh=new Student(103, "Harsha", 98);
		Student ramesh=new Student(103, "Harsha", 96);
		Set<Student> set=new TreeSet<>();		
        //Hashset and equal must be execute together
		set.add(ram);
		set.add(shyam);
		set.add(magesh);
		set.add(ramesh);
		//for(type eachtype :listname)
		for(Student eachStudent:set) {
			System.out.println(eachStudent.getFirstName());
		}
		
	}

}
