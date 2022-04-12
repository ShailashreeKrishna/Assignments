package com.training;

import com.training.model.Student;
import java.util.*;
public class HashSetApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram=new Student(101, "Shree", 90);
		Student shyam=new Student(102, "Kiran", 96);
		Student magesh=new Student(103, "Krish", 98);
		Student ramesh=new Student(103, "Krish", 98);
		Set<Student> set=new HashSet<>();		
        //Hashset and equal must be execute together
		set.add(ram);
		set.add(shyam);
		set.add(magesh);
		set.add(ramesh);
		System.out.println(set);
		System.out.println(set.size());
		
	}

}
