package com.cjc.hl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profession {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String professionType;
	private Double professionSalary;	
	private String professionSalaryType;	
	private String professionWorkingPeriod	;
	private String professionDesignation	;
	private String professionSalarySlips	;//change byte to string
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProfessionSalarySlips() {
		return professionSalarySlips;
	}
	public void setProfessionSalarySlips(String professionSalarySlips) {
		this.professionSalarySlips = professionSalarySlips;
	}
	public String getProfessionType() {
		return professionType;
	}
	public void setProfessionType(String professionType) {
		this.professionType = professionType;
	}
	public Double getProfessionSalary() {
		return professionSalary;
	}
	public void setProfessionSalary(Double professionSalary) {
		this.professionSalary = professionSalary;
	}
	public String getProfessionSalaryType() {
		return professionSalaryType;
	}
	public void setProfessionSalaryType(String professionSalaryType) {
		this.professionSalaryType = professionSalaryType;
	}
	public String getProfessionWorkingPeriod() {
		return professionWorkingPeriod;
	}
	public void setProfessionWorkingPeriod(String professionWorkingPeriod) {
		this.professionWorkingPeriod = professionWorkingPeriod;
	}
	public String getProfessionDesignation() {
		return professionDesignation;
	}
	public void setProfessionDesignation(String professionDesignation) {
		this.professionDesignation = professionDesignation;
	}
	public String getProfessionSalarysLips() {
		return professionSalarySlips;
	}
	public void setProfessionSalarysLips(String professionSalarySlips) {
		this.professionSalarySlips = professionSalarySlips;
	}
	
	

}
