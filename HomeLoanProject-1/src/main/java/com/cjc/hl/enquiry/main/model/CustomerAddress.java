package com.cjc.hl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id	;
	private String customerLocalArea	;
	private String customerLocalCity	;
	private int customerLocalPin	;
	private String customerLocalState	;
	private String customerPermanatArea	;
	private String customerPermanatCity	;
	private int customerPermanatPin	;
	private String customerPermanatState	;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerLocalArea() {
		return customerLocalArea;
	}
	public void setCustomerLocalArea(String customerLocalArea) {
		this.customerLocalArea = customerLocalArea;
	}
	public String getCustomerLocalCity() {
		return customerLocalCity;
	}
	public void setCustomerLocalCity(String customerLocalCity) {
		this.customerLocalCity = customerLocalCity;
	}
	public int getCustomerLocalPin() {
		return customerLocalPin;
	}
	public void setCustomerLocalPin(int customerLocalPin) {
		this.customerLocalPin = customerLocalPin;
	}
	public String getCustomerLocalState() {
		return customerLocalState;
	}
	public void setCustomerLocalState(String customerLocalState) {
		this.customerLocalState = customerLocalState;
	}
	public String getCustomerPermanatArea() {
		return customerPermanatArea;
	}
	public void setCustomerPermanatArea(String customerPermanatArea) {
		this.customerPermanatArea = customerPermanatArea;
	}
	public String getCustomerPermanatCity() {
		return customerPermanatCity;
	}
	public void setCustomerPermanatCity(String customerPermanatCity) {
		this.customerPermanatCity = customerPermanatCity;
	}
	public int getCustomerPermanatPin() {
		return customerPermanatPin;
	}
	public void setCustomerPermanatPin(int customerPermanatPin) {
		this.customerPermanatPin = customerPermanatPin;
	}
	public String getCustomerPermanatState() {
		return customerPermanatState;
	}
	public void setCustomerPermanatState(String customerPermanatState) {
		this.customerPermanatState = customerPermanatState;
	}
	

}
