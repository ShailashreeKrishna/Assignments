package com.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String obj1=new String("apple");
		String obj2=new String("orange");
		String obj3=new String("apple");
		String obj4=new String("pineapple");
		String obj5=new String("orange");
		String obj6=new String("banana");
		
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add(obj1);
		list2.add(obj2);
		list2.add(obj3);
		list2.add(obj4);
		list2.add(obj5);
		list2.add(obj6);
		
		System.out.println(list2);
	
		
	    TreeSet<String> list=new TreeSet<>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		list.add(obj6);
		
			
		
		System.out.println("Output-"+list);
		
		for(String eachName:list2)
		System.out.println(list2.indexOf(eachName));
		
		
	}

}

