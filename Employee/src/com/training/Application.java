package com.training;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee details = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name = sc.next();
		details.setName(name);
		System.out.println("Enter the EmployeeId:");
		int Employeeid = sc.nextInt();
		details.setEmployeeid(Employeeid);
		System.out.println("Enter the salary:");
		int Salary = sc.nextInt();
		details.setSalary(Salary);
		sc.close();
		System.out.println("Name:"+details.getName());
		System.out.println("Employeeid:"+details.getEmployeeid());
		System.out.println("Salary:"+details.getSalary());

	}

}
