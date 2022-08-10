package com.example;

/**
 * Hello world!
 *
 */

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	List<String> names=Arrays.asList("Shree","Krish","Santhosh","Harsha");
    	
    	names.forEach(System.out::println);
    	
    }
}
