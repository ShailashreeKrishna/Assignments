package com.training;

public class BankAccount {
//static variable
	private static int count;
	//instance variable
	private String accountHoldername;
	private int AccountNumber;
	public BankAccount(String accountHoldername, double balance) {
		super();
		this.accountHoldername = accountHoldername;
		this.balance = balance;
		this.AccountNumber=getCount();
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public BankAccount(String accountHoldername, int accountNumber, double balance) {
		super();
		this.accountHoldername = accountHoldername;
		AccountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public static void setCount(int count) {
		BankAccount.count = count;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	private double balance;
	//static method
	public static int getCount() {
		return count++;
		

	}
	//instance method
	public double getUpdatedBalance(double amount) {
		//(parameter variable)
		//local variable
		double updatedBalance;//local variable
		double currentBalance=0;
		//local variable should be initialized before using
		//System.out.println(updatedBalance);
		currentBalance=this.balance+amount;
		this.balance=currentBalance;
		return currentBalance;
	}

}
