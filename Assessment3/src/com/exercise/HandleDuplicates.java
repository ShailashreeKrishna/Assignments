package com.exercise;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class HandleDuplicates {

	public static void main(String[] args) {
		
		List<Integer> ageList=Arrays.asList(45,55,65,75,55,80,95,68);
		
		Set<Integer> filtered=new HashSet<>();
		List<Integer> list =ageList.stream().filter(e-> !filtered.add(e)).collect(toList());//! is a negate operator
		
		System.out.println(list);

	}

}
