package com.training.model;

public abstract class Insurance {
	
	private int policyNumber;
	private String policyHoldername;
	private double Premium;
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insurance(int policyNumber, String policyHoldername) {
		super();
		this.policyNumber = policyNumber;
		this.policyHoldername = policyHoldername;
		
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHoldername() {
		return policyHoldername;
	}
	public void setPolicyHoldername(String policyHoldername) {
		this.policyHoldername = policyHoldername;
	}
	public double getPremium() {
		return Premium;
	}
	public void setPremium(double premium) {
		Premium = premium;
	}
	public abstract double calculatePremium();
	

}
