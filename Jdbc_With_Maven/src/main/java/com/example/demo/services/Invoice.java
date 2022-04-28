package com.example.demo.services;

public class Invoice {
private int invoiceNumber;
private String customerNumber;
private int quantity;
private int productRef;
public Invoice() {
	super();
	// TODO Auto-generated constructor stub
}
public Invoice(int invoiceNumber, String customerNumber, int quantity, int productRef) {
	super();
	this.invoiceNumber = invoiceNumber;
	this.customerNumber = customerNumber;
	this.quantity = quantity;
	this.productRef = productRef;
}
public int getInvoiceNumber() {
	return invoiceNumber;
}
public void setInvoiceNumber(int invoiceNumber) {
	this.invoiceNumber = invoiceNumber;
}
public String getCustomerNumber() {
	return customerNumber;
}
public void setCustomerNumber(String customerNumber) {
	this.customerNumber = customerNumber;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getProductRef() {
	return productRef;
}
public void setProductRef(int productRef) {
	this.productRef = productRef;
}
@Override
public String toString() {
	return "Invoice [invoiceNumber=" + invoiceNumber + ", customerNumber=" + customerNumber + ", quantity=" + quantity
			+ ", productRef=" + productRef + "]";
}

}
