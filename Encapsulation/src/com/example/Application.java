package com.example;
import com.example.model.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student ram = new Student();
        //ram.rollNumber =101;it shows error because rollNumber is a private
        ram.setRollNumber(56020);//public method able to access
        ram.setFirstName("ram");//default method unable to access because it is different package.we can access only it is same package
        ram.setMarkScored(99);//unable to access because Application is not a subclass of Student
        ram.setBranch("ece");//unable to access because the method is private in student class
        System.out.println("Roll Number :="+ram.getRollNumber());
       System.out.println("Mark scored:="+ram.getMarkScored());
       System.out.println("Student Name:"+ram.getFirstName()); 
       Student shyam = new Student(490,"shyam",89,"mech");
      System.out.println("Roll number:"+shyam.getRollNumber());
     System.out.println("Student name:="+shyam.getFirstName());
     Student magesh = new Student(99,"magesh","ece");
     
     System.out.println("studentName:"+magesh.getFirstName()); 
     
	}

}
