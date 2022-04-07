package com.training.model;

public class HealthInsurance extends Insurance {

	
	private String[] preExistingDiseases;
	public String[] getPreExistingDiseases() {
		return preExistingDiseases;
	}
	public void setPreExistingDiseases(String[] preExistingDiseases) {
		this.preExistingDiseases = preExistingDiseases;
	}
	public HealthInsurance(int policyNumber, String policyHoldername, String[] preExistingDiseases) {
		super(policyNumber, policyHoldername);
		this.preExistingDiseases = preExistingDiseases;
	}
	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HealthInsurance(int policyNumber, String policyHoldername) {
		super(policyNumber, policyHoldername);
		// TODO Auto-generated constructor stub
	}
	//@Override
//	public double calculatePremium() {
//		// TODO Auto-generated method stub
//		double premium=10000;
//		
//		for(String eachItem:preExistingDiseases) {
//			String item = eachItem.toLowerCase();
//			if(eachItem.equals("BP")||eachItem.equals("sugar")) {
//				premium = 15000;
//			}
//		}
//		
//		return premium;
//	}
	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium=10000;
		
		for(String eachItem:preExistingDiseases) {
			
			if(eachItem.equals("BP")||eachItem.equals("sugar")) {
				premium = 15000;
			}
		}
		
		return premium;
	}
}
