package com.training;

public class Customer {
	
		private String name;
		private String address;
		private long telephoneNumber;
		private long aadharNumber;
		private long accountNumber;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getTelephoneNumber() {
			return telephoneNumber;
		}
		public void setTelephoneNumber(long telephoneNumber) {
			this.telephoneNumber = telephoneNumber;
		}
		public long getAadharNumber() {
			return aadharNumber;
		}
		public void setAadharNumber(long aadharNumber) {
			this.aadharNumber = aadharNumber;
		}
		public long getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}
		public Customer(String name, String address, long telephoneNumber, long aadharNumber, long accountNumber) {
			super();
			this.name = name;
			this.address = address;
			this.telephoneNumber = telephoneNumber;
			this.aadharNumber = aadharNumber;
			this.accountNumber = accountNumber;
		}
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	}


