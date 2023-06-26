package com.cjc.hl.enquiry.main.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;

@Entity
public class Ledger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerId;
	//@OneToOne(cascade = CascadeType.ALL)
	//private LoanDisbursement loan;
	private String ledgerCreatedDate; 
	private double totalLoanAmount;
	private double payableAmountwithInterest;
	private int tenure;
	private double monthlyEMI;
	private double amountPaidtillDate;
	private double remainingAmount;
	private String nextEMIDateStart;
	private String nextEMIDateEnd;
	private int defaulterCount;
	private String previousEMIstatus;
	private String currentMonthEMIstatus;
	private String loanEndDate;
	private String loanStatus;
//	@OneToOne(cascade = CascadeType.ALL)
//	private DefaulterList dl;
	
	public int getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}
	
	public String getLedgerCreatedDate() {
		return ledgerCreatedDate;
	}
	public void setLedgerCreatedDate(String ledgerCreatedDate) {
		this.ledgerCreatedDate = ledgerCreatedDate;
	}
	public double getTotalLoanAmount() {
		return totalLoanAmount;
	}
	public void setTotalLoanAmount(double totalLoanAmount) {
		this.totalLoanAmount = totalLoanAmount;
	}
	public double getPayableAmountwithInterest() {
		return payableAmountwithInterest;
	}
	public void setPayableAmountwithInterest(double payableAmountwithInterest) {
		this.payableAmountwithInterest = payableAmountwithInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getMonthlyEMI() {
		return monthlyEMI;
	}
	public void setMonthlyEMI(double monthlyEMI) {
		this.monthlyEMI = monthlyEMI;
	}
	public double getAmountPaidtillDate() {
		return amountPaidtillDate;
	}
	public void setAmountPaidtillDate(double amountPaidtillDate) {
		this.amountPaidtillDate = amountPaidtillDate;
	}
	public double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	public String getNextEMIDateStart() {
		return nextEMIDateStart;
	}
	public void setNextEMIDateStart(String nextEMIDateStart) {
		this.nextEMIDateStart = nextEMIDateStart;
	}
	public String getNextEMIDateEnd() {
		return nextEMIDateEnd;
	}
	public void setNextEMIDateEnd(String nextEMIDateEnd) {
		this.nextEMIDateEnd = nextEMIDateEnd;
	}
	public int getDefaulterCount() {
		return defaulterCount;
	}
	public void setDefaulterCount(int defaulterCount) {
		this.defaulterCount = defaulterCount;
	}
	public String getPreviousEMIstatus() {
		return previousEMIstatus;
	}
	public void setPreviousEMIstatus(String previousEMIstatus) {
		this.previousEMIstatus = previousEMIstatus;
	}
	public String getCurrentMonthEMIstatus() {
		return currentMonthEMIstatus;
	}
	public void setCurrentMonthEMIstatus(String currentMonthEMIstatus) {
		this.currentMonthEMIstatus = currentMonthEMIstatus;
	}
	public String getLoanEndDate() {
		return loanEndDate;
	}
	public void setLoanEndDate(String loanEndDate) {
		this.loanEndDate = loanEndDate;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
//	public LoanDisbursement getLoan() {
//		return loan;
//	}
//	public void setLoan(LoanDisbursement loan) {
//		this.loan = loan;
//	}
//	public DefaulterList getDl() {
//		return dl;
//	}
//	public void setDl(DefaulterList dl) {
//		this.dl = dl;
//	}
	
	
	
	
	
	

}
