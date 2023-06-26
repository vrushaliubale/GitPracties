package com.cjc.hl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private int propDocId;
	 private int cusId;
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	@Lob
     private byte[] agreement;
	@Lob
     private byte[] occupancyCertificate;
	@Lob
     private byte[] electricityBill;
	@Lob
     private byte[] propertyTax;
	@Lob
     private byte[] conveyanceDeed;
	@Lob
     private byte[] paymentReceiptAcStatement;
	@Lob
	private byte[]  appFormwithPhotodulySigned	;
	@Lob
	private byte[] last6monthBankStatements;
	@Lob
	private byte[] last3MonthSalarySlip	;
	@Lob
	private byte[] processingFeeCheque	;
	@Lob
	private byte[] form16	;
	@Lob
	private byte[] proofOfBusinessExistence	;
	@Lob
	private byte[]	buisinessProfile	;
	@Lob
	private byte[] educationQualification	;
	@Lob
	private byte[] panCard	;
	@Lob
	private byte[] adharCard	;
	@Lob
	private byte[] ageProof	;
	@Lob
	private byte[] residenceProof	;
	@Lob
	private byte[] last3yrITRwithComputationofIncome	;
	@Lob
	private byte[] last3yrCACertificate;
	
	public int getPropDocId() {
		return propDocId;
	}
	public void setPropDocId(int propDocId) {
		this.propDocId = propDocId;
	}
	public byte[] getAgreement() {
		return agreement;
	}
	public void setAgreement(byte[] agreement) {
		this.agreement = agreement;
	}
	public byte[] getOccupancyCertificate() {
		return occupancyCertificate;
	}
	public void setOccupancyCertificate(byte[] occupancyCertificate) {
		this.occupancyCertificate = occupancyCertificate;
	}
	public byte[] getElectricityBill() {
		return electricityBill;
	}
	public void setElectricityBill(byte[] electricityBill) {
		this.electricityBill = electricityBill;
	}
	public byte[] getPropertyTax() {
		return propertyTax;
	}
	public void setPropertyTax(byte[] propertyTax) {
		this.propertyTax = propertyTax;
	}
	public byte[] getConveyanceDeed() {
		return conveyanceDeed;
	}
	public void setConveyanceDeed(byte[] conveyanceDeed) {
		this.conveyanceDeed = conveyanceDeed;
	}
	public byte[] getPaymentReceiptAcStatement() {
		return paymentReceiptAcStatement;
	}
	public void setPaymentReceiptAcStatement(byte[] paymentReceiptAcStatement) {
		this.paymentReceiptAcStatement = paymentReceiptAcStatement;
	}
	
	public byte[] getAppFormwithPhotodulySigned() {
		return appFormwithPhotodulySigned;
	}
	public void setAppFormwithPhotodulySigned(byte[] appFormwithPhotodulySigned) {
		this.appFormwithPhotodulySigned = appFormwithPhotodulySigned;
	}
	public byte[] getLast6monthBankStatements() {
		return last6monthBankStatements;
	}
	public void setLast6monthBankStatements(byte[] last6monthBankStatements) {
		this.last6monthBankStatements = last6monthBankStatements;
	}
	public byte[] getLast3MonthSalarySlip() {
		return last3MonthSalarySlip;
	}
	public void setLast3MonthSalarySlip(byte[] last3MonthSalarySlip) {
		this.last3MonthSalarySlip = last3MonthSalarySlip;
	}
	public byte[] getProcessingFeeCheque() {
		return processingFeeCheque;
	}
	public void setProcessingFeeCheque(byte[] processingFeeCheque) {
		this.processingFeeCheque = processingFeeCheque;
	}
	public byte[] getForm16() {
		return form16;
	}
	public void setForm16(byte[] form16) {
		this.form16 = form16;
	}
	public byte[] getProofOfBusinessExistence() {
		return proofOfBusinessExistence;
	}
	public void setProofOfBusinessExistence(byte[] proofOfBusinessExistence) {
		this.proofOfBusinessExistence = proofOfBusinessExistence;
	}
	public byte[] getBuisinessProfile() {
		return buisinessProfile;
	}
	public void setBuisinessProfile(byte[] buisinessProfile) {
		this.buisinessProfile = buisinessProfile;
	}
	public byte[] getEducationQualification() {
		return educationQualification;
	}
	public void setEducationQualification(byte[] educationQualification) {
		this.educationQualification = educationQualification;
	}
	public byte[] getPanCard() {
		return panCard;
	}
	public void setPanCard(byte[] panCard) {
		this.panCard = panCard;
	}
	public byte[] getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(byte[] adharCard) {
		this.adharCard = adharCard;
	}
	public byte[] getAgeProof() {
		return ageProof;
	}
	public void setAgeProof(byte[] ageProof) {
		this.ageProof = ageProof;
	}
	public byte[] getResidenceProof() {
		return residenceProof;
	}
	public void setResidenceProof(byte[] residenceProof) {
		this.residenceProof = residenceProof;
	}
	public byte[] getLast3yrITRwithComputationofIncome() {
		return last3yrITRwithComputationofIncome;
	}
	public void setLast3yrITRwithComputationofIncome(byte[] last3yrITRwithComputationofIncome) {
		this.last3yrITRwithComputationofIncome = last3yrITRwithComputationofIncome;
	}
	public byte[] getLast3yrCACertificate() {
		return last3yrCACertificate;
	}
	public void setLast3yrCACertificate(byte[] last3yrCACertificate) {
		this.last3yrCACertificate = last3yrCACertificate;
	}
	

}
