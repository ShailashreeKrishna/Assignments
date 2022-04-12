package com.training;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;

public class HashMapApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram=new Student(101,"anand",45);
		Student shyam=new Student(102,"basky",85);
		Student mukesh=new Student(103,"Shree",75);
		HashMap<Integer, Student> map=new HashMap<>();
		map.put(67,ram);
		map.put(56,shyam);
		
		System.out.println(map.get(56));
		System.out.println(map.get(67));
		//for map we cannot use for each loop,iterator
		
		
		//to collect all the key
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		for(Integer key:keys) {
		System.out.println(map.get(keys));
	}
		//to get only the value
		Collection<Student> list=map.values();
		for(Student eachStudent:list) {
			System.out.println(eachStudent);
		}
		//to get both key and value //map.entry is a kind of interface
		Set<Map.Entry<Integer, Student>> list2=map.entrySet();
		for(Map.Entry<Integer,Student> eachEntry:list2) {
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
			
		}
		
		//normal for loop
//		String[] names= {"shree","ram","kiran"};
//		for(String name:names) {//for(type variablename:objectname)
//			System.out.println(name);
//			//for iterator type
//			List<Student> studlist=new ArrayList<>();
//			for(Student eachstud:studlist) {//for(class variablename:objectname)
//				System.out.println();
//			}
			
		}
	}

