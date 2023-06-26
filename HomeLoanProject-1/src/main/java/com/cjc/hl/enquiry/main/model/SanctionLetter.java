package com.cjc.hl.enquiry.main.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class SanctionLetter 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int sanctionId;
	private String name;
	private String age;
	private long contact;
	private String email;
	private String status;
	private double amount;
	private double requiredLoanAmount;
	private String emistatus;
	public String getEmistatus() {
		return emistatus;
	}
	public void setEmistatus(String emistatus) {
		this.emistatus = emistatus;
	}
	public double getRequiredLoanAmount() {
		return requiredLoanAmount;
	}
	public void setRequiredLoanAmount(double requiredLoanAmount) {
		this.requiredLoanAmount = requiredLoanAmount;
	}
	private int cid;
	 
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@NotBlank(message = "Please enter proper Sanction Date")
	private String sanctionDate;
	
	//@NotBlank(message = "Please enter Rate Of Interest")
	private int rateOfInterest;
	
	//@NotBlank(message = "Please enter proper Loan Tenure")
	private int loanTenure;
	
	//@Min(message="Please enter proper Monthly Emi Amount",value = 1)
	private double monthlyEmiAmount;
	
	//@NotBlank(message = "Please enter proper Applicant Name")
	//private String applicantName;
	
	//@Min(message="Please enter Proper contact details",value = 1)
	//private long contactDetails;
	
	//@NotBlank(message = "Please enter proper Home Equity")
	//private String producthomeEquity;
	
	//@Min(message="Please enter proper Sanctioned Loan Amount",value = 1)
	//private double loanAmtSanctioned;
	
	//@NotBlank(message = "Please enter proper Interest Type")
	//private String interestType;
	
	
	
	//@NotBlank(message = "Please enter Mode of Payment")
	//private String modeOfPayment;
	
	//@NotBlank(message = "Please enter proper remarks")
	//private String remarks;
	
	//@NotBlank(message = "Please enter email")
	//private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//private String termsCondition;
	
	//@NotBlank(message = "Please enter proper status")
	//private String status;
	
	public int getSanctionId() {
		return sanctionId;
	}
	public void setSanctionId(int sanctionId) {
		this.sanctionId = sanctionId;
	}
	public String getSanctionDate() {
		return sanctionDate;
	}
	public void setSanctionDate(String sanctionDate) {
		this.sanctionDate = sanctionDate;
	}
//	public String getApplicantName() {
//		return applicantName;
//	}
//	public void setApplicantName(String applicantName) {
//		this.applicantName = applicantName;
//	}
//	public long getContactDetails() {
//		return contactDetails;
//	}
//	public void setContactDetails(long contactDetails) {
//		this.contactDetails = contactDetails;
//	}
//	public String getProducthomeEquity() {
//		return producthomeEquity;
//	}
//	public void setProducthomeEquity(String producthomeEquity) {
//		this.producthomeEquity = producthomeEquity;
//	}
//	public double getLoanAmtSanctioned() {
//		return loanAmtSanctioned;
//	}
//	public void setLoanAmtSanctioned(double loanAmtSanctioned) {
//		this.loanAmtSanctioned = loanAmtSanctioned;
//	}
//	public String getInterestType() {
//		return interestType;
//	}
//	public void setInterestType(String interestType) {
//		this.interestType = interestType;
//	}
	public int getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	public double getMonthlyEmiAmount() {
		return monthlyEmiAmount;
	}
	public void setMonthlyEmiAmount(double monthlyEmiAmount) {
		this.monthlyEmiAmount = monthlyEmiAmount;
	}
//	public String getModeOfPayment() {
//		return modeOfPayment;
//	}
//	public void setModeOfPayment(String modeOfPayment) {
//		this.modeOfPayment = modeOfPayment;
//	}
//	public String getRemarks() {
//		return remarks;
//	}
//	public void setRemarks(String remarks) {
//		this.remarks = remarks;
//	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
