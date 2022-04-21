package com.training;
import java.util.*;
import com.training.exception.RangeCheckException;
import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) throws Exception  {
	
		// TODO Auto-generated method stub
		Student ram;
		try {
			ram = new Student(1010,"Shree",99);
		} catch (RangeCheckException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Student ram1 = new Student(1010,"Shree",99);
		StudentService service = new StudentService(ram1);
		System.out.println(service.sendDetails());
		StudentService service2 = new StudentService(ram1);
		try {
			System.out.println(service2.findRank());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Name is not passed");
			
		}
        ExceptionHandling exHandling = new ExceptionHandling();
      //exHandling.usingArrayIndexException(args);
       // exHandling.usingNumberFormateException("4");
      // try {
		System.out.println( exHandling.underStandFinallyBlock());
	//} catch (Exception e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		
		//since we are using try with resource - scanner will be closed
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Number");
			int num=sc.nextInt();
			System.out.println(num);
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
