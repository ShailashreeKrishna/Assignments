package com.training;

import com.training.model.Address;

public class MobileBill {
//	1	Create a Java Class MobileBill
//	2	Add attributes like String customerName, long mobilenumber ,String planname and Address address
//	3	Create overloaded constructor  zero and parametrized
//	4	Define one  Constant(public static final)  in the class
//	5.  Create a Method findAmount and Use switch case to calculate the amount based on the planName
//	     If its prepaid   amount is 200 and postpaid its 300
//	6.  Test the Methods by Calling from the main Method     

	private String customerName;
	private long mobileNumber;
	private String planName;
	private Address address;
	public static final String BRAND_NAME="JIO";
	public MobileBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MobileBill(String customerName, long mobileNumber, String planName, Address address) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.planName = planName;
		this.address = address;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
    public int findAmount() {
    	
    	int amount=0;
    	switch(planName) {
    	
    	case "prepaid":
    		amount=200;
    		break;
    	case "postpaid":
    		amount=300;
    	    break;
    	    
    	}
        return amount;
	
}

}