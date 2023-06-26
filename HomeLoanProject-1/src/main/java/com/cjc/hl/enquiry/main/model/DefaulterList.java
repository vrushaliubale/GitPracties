package com.cjc.hl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DefaulterList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int defaulterId;
	private int cutomerId;
	private String defaulterName;
	private long defaulterMobileNo;
	private String defaulterEmailId;
	private String status;
	private String emiStatus;
	
	public String getEmiStatus() {
		return emiStatus;
	}
	public void setEmiStatus(String emiStatus) {
		this.emiStatus = emiStatus;
	}
	public int getDefaulterId() {
		return defaulterId;
	}
	public void setDefaulterId(int defaulterId) {
		this.defaulterId = defaulterId;
	}
	public int getCutomerId() {
		return cutomerId;
	}
	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}
	public String getDefaulterName() {
		return defaulterName;
	}
	public void setDefaulterName(String defaulterName) {
		this.defaulterName = defaulterName;
	}
	public long getDefaulterMobileNo() {
		return defaulterMobileNo;
	}
	public void setDefaulterMobileNo(long defaulterMobileNo) {
		this.defaulterMobileNo = defaulterMobileNo;
	}
	public String getDefaulterEmailId() {
		return defaulterEmailId;
	}
	public void setDefaulterEmailId(String defaulterEmailId) {
		this.defaulterEmailId = defaulterEmailId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
