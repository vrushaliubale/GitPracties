package com.cjc.hl.enquiry.main.model;



import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Cascade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CurrentLoan {
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Id
	private int currentloanId;
	
	private int currentloanNo;
	@OneToOne(cascade=CascadeType.ALL)
	private EMIDetails emidetails;
	@Min(message = "Loan Amount Greater than 1", value = 1)
	private double loanAmount;
	@NotBlank(message = "rate of interest should be Greate than 1% and less Than 12 %")
	private String rateOfInterest;
	@NotBlank(message = "tenure Greater than 1")
	private String tenure;
	@Min(message = "totalAmounttobepaid Greater than 1", value = 1)
	private double totalAmounttobepaid;
	@Min(message = "processingFees Greater than 1", value = 1)
	private int processingFees;
	private double totalInterest;
	private String sanctionDate ;
	@OneToOne(cascade=CascadeType.ALL)
	private BankAddress bankaddress;
	private String remark;
	private String status;
	
	
	public int getCurrentloanId() {
		return currentloanId;
	}
	public void setCurrentloanId(int currentloanId) {
		this.currentloanId = currentloanId;
	}
	public int getCurrentloanNo() {
		return currentloanNo;
	}
	public void setCurrentloanNo(int currentloanNo) {
		this.currentloanNo = currentloanNo;
	}
	public EMIDetails getEmidetails() {
		return emidetails;
	}
	public void setEmidetails(EMIDetails emidetails) {
		this.emidetails = emidetails;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public double getTotalAmounttobepaid() {
		return totalAmounttobepaid;
	}
	public void setTotalAmounttobepaid(double totalAmounttobepaid) {
		this.totalAmounttobepaid = totalAmounttobepaid;
	}
	public int getProcessingFees() {
		return processingFees;
	}
	public void setProcessingFees(int processingFees) {
		this.processingFees = processingFees;
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}
	public String getSanctionDate() {
		return sanctionDate;
	}
	public void setSanctionDate(String sanctionDate) {
		this.sanctionDate = sanctionDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BankAddress getBankaddress() {
		return bankaddress;
	}
	public void setBankaddress(BankAddress bankaddress) {
		this.bankaddress = bankaddress;
	}
	
	
	
	

}
