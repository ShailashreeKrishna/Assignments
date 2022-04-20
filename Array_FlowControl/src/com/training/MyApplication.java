package com.training;
import com.training.model.BankAccount;
import com.training.services.BankAccountService;
import java.util.*;
public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountService service = new BankAccountService();
		BankAccount[] list=	new BankAccount[1];
		int idx=0;
		int choice=1;
				Scanner sc = new Scanner(System.in);
		do {
		
		
		System.out.println("Enter the accountnumber:");
		int accountNumber = sc.nextInt();
		
		
		System.out.println("enter holdername:");
		String accountHolderName = sc.next();
		
		System.out.println("enter balance");
		double balance=sc.nextDouble();
		
		System.out.println("Account Type[savings,fixed,recurring]");
		String accountType=sc.next();
		System.out.println("Enter 0 to end 1 continue");
		choice=sc.nextInt();
		BankAccount account = new BankAccount(accountNumber,accountHolderName,balance,accountType);
		
		list[idx]=account;
		
		
		
		}while(choice==1);
			
			double[] values = service.findInterestByAccountType(list);
			for(double eachValue: values) {
				System.out.println(eachValue);
				sc.close();
			}
			

}
}