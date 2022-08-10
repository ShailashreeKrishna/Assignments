package com.example.entity;

import java.sql.Date;
import java.time.LocalDate;

public class Member {

	private int memberID;
	private String memberName;
	private String memberAddress;
	private LocalDate accountOpenDate;
	private String memberShipType;
	private double feesPaid;
	private int maxBookAllowed;
	private double penaltyAmount;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(int memberID, String memberName, String memberAddress, LocalDate accountOpenDate2,
			String memberShipType, double feesPaid, int maxBookAllowed, double penaltyAmount) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.accountOpenDate = accountOpenDate2;
		this.memberShipType = memberShipType;
		this.feesPaid = feesPaid;
		this.maxBookAllowed = maxBookAllowed;
		this.penaltyAmount = penaltyAmount;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public LocalDate getAccountOpenDate() {
		return accountOpenDate;
	}
	public void setAccountOpenDate(LocalDate accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}
	public String getMemberShipType() {
		return memberShipType;
	}
	public void setMemberShipType(String memberShipType) {
		this.memberShipType = memberShipType;
	}
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	public int getMaxBookAllowed() {
		return maxBookAllowed;
	}
	public void setMaxBookAllowed(int maxBookAllowed) {
		this.maxBookAllowed = maxBookAllowed;
	}
	public double getPenaltyAmount() {
		return penaltyAmount;
	}
	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	@Override
	public String toString() {
		return "Member [memberID=" + memberID + ", memberName=" + memberName + ", memberAddress=" + memberAddress
				+ ", accountOpenDate=" + accountOpenDate + ", memberShipType=" + memberShipType + ", feesPaid="
				+ feesPaid + ", maxBookAllowed=" + maxBookAllowed + ", penaltyAmount=" + penaltyAmount + "]";
	}
	
	
	
	
}
