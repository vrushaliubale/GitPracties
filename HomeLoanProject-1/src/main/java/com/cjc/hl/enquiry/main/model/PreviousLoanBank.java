package com.cjc.hl.enquiry.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
public class PreviousLoanBank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id	;
//	@NonNull
	private String branchName	;
//	@NotBlank
//	@Size(min=4,message = "branchCode must be min of 4 char")
	private double branchCode	;
//	@NotBlank
//	@Size(min=3,message = "branchType must be min of 4 char")
	private String branchType;//(main/sub)	
//	@NotBlank
	//@Size(min=4,message = "ifsc must be min of 4 char")
	private String ifsc ;	
//	@NotBlank
//	@Size(min=4,message = "micr must be min of 4 char")
	private String micr ;	
	//@NotBlank
	//@Size(min=10,message = "conatctNumber must be min of 4 char")
	private long conatctNumber	;
	@OneToOne(cascade =  CascadeType.ALL)
	private BankAddress bankAddress;	
	//@Email
	private String email;	
	private String status	;
	public BankAddress getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(BankAddress bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public double getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(double branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchType() {
		return branchType;
	}
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getMicr() {
		return micr;
	}
	public void setMicr(String micr) {
		this.micr = micr;
	}
	public long getConatctNumber() {
		return conatctNumber;
	}
	public void setConatctNumber(long conatctNumber) {
		this.conatctNumber = conatctNumber;
	}
	

}
