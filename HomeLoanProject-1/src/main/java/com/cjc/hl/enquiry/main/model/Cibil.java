package com.cjc.hl.enquiry.main.model;



import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Cibil {
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Id
	private int cibilId;
	private String date;
	@NotBlank(message = "pan card num cannot be null or empty")
	private String pancardNo;
	private int cibilScore;
	

	
	public int getCibilId() {
		return cibilId;
	}
	public void setCibilId(int cibilId) {
		this.cibilId = cibilId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
	
	

}
