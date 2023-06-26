package com.cjc.hl.enquiry.main.model;



import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EMIDetails {
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Id
	private int emiID;
	private Integer paymentNumber ;
	private Integer customerId;
	private LocalDate paymentdate;
	private double balance;
	private double emiPaid;
	private String status;
	public int getEmiID() {
		return emiID;
	}
	public void setEmiID(int emiID) {
		this.emiID = emiID;
	}
	public Integer getPaymentNumber() {
		return paymentNumber;
	}
	public void setPaymentNumber(Integer paymentNumber) {
		this.paymentNumber = paymentNumber;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public LocalDate getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(LocalDate paymentdate) {
		this.paymentdate = paymentdate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getEmiPaid() {
		return emiPaid;
	}
	public void setEmiPaid(double emiPaid) {
		this.emiPaid = emiPaid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
	

}
