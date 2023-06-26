package com.cjc.hl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerVerification {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String  verificationDate;
	private String status;
	private String remarks;
	private int cid;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getVerificationDate() {
		return verificationDate;
	}
	public void setVerificationDate(String verificationDate) {
		this.verificationDate = verificationDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
}
