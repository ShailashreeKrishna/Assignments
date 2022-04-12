package com.training;
import java.util.*;

import com.training.model.Student;
public class HashMapApplication {

	public static void main(String[] args) {
		
		
		Student ram=new Student(101,"anand",45);
		Student shyam=new Student(102,"basky",85);
		Student mukesh=new Student(103,"Shree",75);
		HashMap<Integer, Student> map=new HashMap<>();
		
		System.out.println(map.put(67, ram));//it check whether the id is present or not;
		System.out.println(map.put(56, shyam));
		System.out.println(map.put(56, mukesh));
		map.put(67,ram);//it doesn't print anything rather it get value;
		map.put(56,shyam);
		
		System.out.println(map.get(56));
		System.out.println(map.get(67));
		
		Student added=map.put(67, mukesh);//method to allocate new place to mukesh;
		if(added!=null) {//if place is empty it allocate new place to mukesh
			map.put(68, added);//adding mukesh to 68 place
		}
		
		}

}
