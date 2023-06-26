package com.cjc.hl.enquiry.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class CustomerDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id	;
	//@NotBlank
	//@Size(min=3,message = "FirstName must be min of 3 charactore")
	private String firstName;
	//@NotBlank
	//@Size(min=3,message = "LastName must be min of 3 charactore")
	private String	lastName;
	private String email;
	private long contact;
	//@NotBlank
	//@Size(min=2,message = "age must be min of 2 charactore")
	private int age	;
	@OneToOne(cascade =  CascadeType.ALL)
	private CustomerAddress customerAddress	;
	@OneToOne(cascade =  CascadeType.ALL)
	private Profession profession	;
	@OneToOne(cascade =  CascadeType.ALL)
	private GuarntorDetails guarntorDetails	;
	@OneToOne(cascade =  CascadeType.ALL)
	private PropertyInfo propertyDetails	;
	@OneToOne(cascade =  CascadeType.ALL)
	private PreviousLoan previousLoan	;
	
	private String  panAdharLinkStatus;
	private int requiredLoanAmount;
	private int tenure	;
	private String custType	;
    private int educationId	;
	private String educationType;
	private String status;
	
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLname() {
		return lastName;
	}
	public void setLname(String lname) {
		this.lastName = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	public GuarntorDetails getGuarntorDetails() {
		return guarntorDetails;
	}
	public void setGuarntorDetails(GuarntorDetails guarntorDetails) {
		this.guarntorDetails = guarntorDetails;
	}
	public PropertyInfo getPropertyDetails() {
		return propertyDetails;
	}
	public void setPropertyDetails(PropertyInfo propertyDetails) {
		this.propertyDetails = propertyDetails;
	}
	public PreviousLoan getPreviousLoan() {
		return previousLoan;
	}
	public void setPreviousLoan(PreviousLoan previousLoan) {
		this.previousLoan = previousLoan;
	}
	public String getPanAdharLinkStatus() {
		return panAdharLinkStatus;
	}
	public void setPanAdharLinkStatus(String panAdharLinkStatus) {
		this.panAdharLinkStatus = panAdharLinkStatus;
	}
	public int getRequiredLoanAmount() {
		return requiredLoanAmount;
	}
	public void setRequiredLoanAmount(int requiredLoanAmount) {
		this.requiredLoanAmount = requiredLoanAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public int getEducationId() {
		return educationId;
	}
	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}
	public String getEducationType() {
		return educationType;
	}
	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	

}
