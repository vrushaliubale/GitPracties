package com.cjc.hl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class GuarntorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id	;
	//@NotBlank
	//@Size(min=3,message = "guarantorName must be min of 3 charactore")
	private String guarantorName	;
	//@NotBlank
	//@Size(min=3,message = "guarantorDateOfBirth must be min of 4 charactore")
	private String guarantorDateOfBirth;	
	//@NotBlank
	//@Size(min=3,message = "guarantorRelationshipwithCustomer must be min of 4 charactore")
	private String guarantorRelationshipwithCustomer;	
//	@NotBlank
//	@Size(min=3,message = "garentorMobileNumber must be min of 4 charactore")
	private Long garentorMobileNumber	;
	//@NotBlank
	//@Size(min=7,message = "guarantorAdharCardNo must be min of 7 charactore")
	private Long guarantorAdharCardNo	;
	//@NotBlank
	//@Size(min=3,message = "guarantorJobDetails must be min of 4 charactore")
	private String guarantorJobDetails	;
//	@NotBlank
	//@Size(min=3,message = "guarantorLoaclAddress must be min of 4 charactore")
	private String guarantorLoaclAddress;	
	//@NotBlank
	//@Size(min=3,message = "guarantorPermanentAddress must be min of 4 charactore")
	private String guarantorPermanentAddress	;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGuarantorName() {
		return guarantorName;
	}
	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}
	public String getGuarantorDateOfBirth() {
		return guarantorDateOfBirth;
	}
	public void setGuarantorDateOfBirth(String guarantorDateOfBirth) {
		this.guarantorDateOfBirth = guarantorDateOfBirth;
	}
	public String getGuarantorRelationshipwithCustomer() {
		return guarantorRelationshipwithCustomer;
	}
	public void setGuarantorRelationshipwithCustomer(String guarantorRelationshipwithCustomer) {
		this.guarantorRelationshipwithCustomer = guarantorRelationshipwithCustomer;
	}
	public Long getGarentorMobileNumber() {
		return garentorMobileNumber;
	}
	public void setGarentorMobileNumber(Long garentorMobileNumber) {
		this.garentorMobileNumber = garentorMobileNumber;
	}
	public Long getGuarantorAdharCardNo() {
		return guarantorAdharCardNo;
	}
	public void setGuarantorAdharCardNo(Long guarantorAdharCardNo) {
		this.guarantorAdharCardNo = guarantorAdharCardNo;
	}
	public String getGuarantorJobDetails() {
		return guarantorJobDetails;
	}
	public void setGuarantorJobDetails(String guarantorJobDetails) {
		this.guarantorJobDetails = guarantorJobDetails;
	}
	public String getGuarantorLoaclAddress() {
		return guarantorLoaclAddress;
	}
	public void setGuarantorLoaclAddress(String guarantorLoaclAddress) {
		this.guarantorLoaclAddress = guarantorLoaclAddress;
	}
	public String getGuarantorPermanentAddress() {
		return guarantorPermanentAddress;
	}
	public void setGuarantorPermanentAddress(String guarantorPermanentAddress) {
		this.guarantorPermanentAddress = guarantorPermanentAddress;
	}
	
}
