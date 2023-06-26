package com.cjc.hl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class EnquiryDetails {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//@NotBlank
//	@Size(min=4,message = "firstName must be min of 2 char")
	private String firstName;
	//@NotBlank
	//@Size(min=4,message = "middleName must be min of 2 char")
	private String middleName;
	//@NotBlank
	//@Size(min=4,message = "lastName must be min of 2 char")
	private String lastName;
	private int age;
	private String address;
	private String country;
	private String existingCustomer;
	//@Email(message = "Enter valid email id")
	private String email;
	//@NotBlank
	//@Size(min=10,message = "mobileNo must be min of 10 char")
	private long mobileNo;
	//@NotBlank
	
	private String preferedContactTime;
	////@NotBlank
	
	private String preferedBranchCode;
	private String adharNo;
	//@NotBlank
	//@Size(min=7,message = "pancardNo must be min of 7 char")
	private String pancardNo;
	private int cibilScore;
	private String custType;
	
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getExistingCustomer() {
		return existingCustomer;
	}
	public void setExistingCustomer(String existingCustomer) {
		this.existingCustomer = existingCustomer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPreferedContactTime() {
		return preferedContactTime;
	}
	public void setPreferedContactTime(String preferedContactTime) {
		this.preferedContactTime = preferedContactTime;
	}
	public String getPreferedBranchCode() {
		return preferedBranchCode;
	}
	public void setPreferedBranchCode(String preferedBranchCode) {
		this.preferedBranchCode = preferedBranchCode;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getPancardNo() {
		return pancardNo;
	}
	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}
	public int getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}

}
