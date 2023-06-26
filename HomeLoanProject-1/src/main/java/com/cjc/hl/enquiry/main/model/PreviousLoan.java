package com.cjc.hl.enquiry.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class PreviousLoan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id	;
	//@NotBlank
	private double  previousLoanAmount	;
	//@NotBlank
	private int previousLoanTenure	;
	//@NotBlank
	private double previousLoanpaidAmount	;
//	@NotBlank
	private double previousLoanremainingAmount	;
//	@NotBlank
	private int previousLoandeafulterCount	;
	@OneToOne(cascade =  CascadeType.ALL)
	private PreviousLoanBank previousLoanbankDetails;	
	//@NotBlank
	private String previousLoanStatus	;
	//@NotBlank
	private String previousLoanRemark	;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPreviousLoanAmount() {
		return previousLoanAmount;
	}
	public void setPreviousLoanAmount(double previousLoanAmount) {
		this.previousLoanAmount = previousLoanAmount;
	}
	public int getPreviousLoanTenure() {
		return previousLoanTenure;
	}
	public void setPreviousLoanTenure(int previousLoanTenure) {
		this.previousLoanTenure = previousLoanTenure;
	}
	public double getPreviousLoanpaidAmount() {
		return previousLoanpaidAmount;
	}
	public void setPreviousLoanpaidAmount(double previousLoanpaidAmount) {
		this.previousLoanpaidAmount = previousLoanpaidAmount;
	}
	public double getPreviousLoanremainingAmount() {
		return previousLoanremainingAmount;
	}
	public void setPreviousLoanremainingAmount(double previousLoanremainingAmount) {
		this.previousLoanremainingAmount = previousLoanremainingAmount;
	}
	public int getPreviousLoandeafulterCount() {
		return previousLoandeafulterCount;
	}
	public void setPreviousLoandeafulterCount(int previousLoandeafulterCount) {
		this.previousLoandeafulterCount = previousLoandeafulterCount;
	}
	public PreviousLoanBank getPreviousLoanbankDetails() {
		return previousLoanbankDetails;
	}
	public void setPreviousLoanbankDetails(PreviousLoanBank previousLoanbankDetails) {
		this.previousLoanbankDetails = previousLoanbankDetails;
	}
	public String getPreviousLoanStatus() {
		return previousLoanStatus;
	}
	public void setPreviousLoanStatus(String previousLoanStatus) {
		this.previousLoanStatus = previousLoanStatus;
	}
	public String getPreviousLoanRemark() {
		return previousLoanRemark;
	}
	public void setPreviousLoanRemark(String previousLoanRemark) {
		this.previousLoanRemark = previousLoanRemark;
	}
}
