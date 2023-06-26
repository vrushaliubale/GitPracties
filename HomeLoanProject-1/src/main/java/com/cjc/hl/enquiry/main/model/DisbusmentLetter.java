package com.cjc.hl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DisbusmentLetter{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
private int sanctionId;
private int customerId;
private String name;
private String age;
private String email;
private long mobileno;
private String customerBankName;
private int tenure;
private int requiredLoan;
private int sanctionAmount;
private int rateOfInterest;
private double emi;
private String status;
public int getSanctionId() {
	return sanctionId;
}
public void setSanctionId(int sanctionId) {
	this.sanctionId = sanctionId;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
public String getCustomerBankName() {
	return customerBankName;
}
public void setCustomerBankName(String customerBankName) {
	this.customerBankName = customerBankName;
}
public int getTenure() {
	return tenure;
}
public void setTenure(int tenure) {
	this.tenure = tenure;
}
public int getRequiredLoan() {
	return requiredLoan;
}
public void setRequiredLoan(int requiredLoan) {
	this.requiredLoan = requiredLoan;
}
public int getSanctionAmount() {
	return sanctionAmount;
}
public void setSanctionAmount(int sanctionAmount) {
	this.sanctionAmount = sanctionAmount;
}
public int getRateOfInterest() {
	return rateOfInterest;
}
public void setRateOfInterest(int rateOfInterest) {
	this.rateOfInterest = rateOfInterest;
}
public double getEmi() {
	return emi;
}
public void setEmi(double emi) {
	this.emi = emi;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}



}
