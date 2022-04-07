package com.training.model;

public class LifeInsurance extends Insurance {

	private int age;

	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public LifeInsurance(int policyNumber, String policyHoldername, int age) {
		super(policyNumber, policyHoldername);
		this.age = age;
	}



	public LifeInsurance(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public double calculatePremium() {
		double premium=10000;
		if(age<50) {
			premium=5000;
		}
		
		return premium;
	
	}
	
}
