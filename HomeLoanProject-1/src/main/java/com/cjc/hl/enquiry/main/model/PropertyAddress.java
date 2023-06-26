package com.cjc.hl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class PropertyAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	//@NotBlank
	//@Size(min=3,message = "areaname must be min of 3 charactore")
	private String areaname	;
	//@NotBlank
	//@Size(min=4,message = "cityname must be min of 4 charactore")
	private String  cityname	;
	//@NotBlank
	//@Size(min=4,message = "district must be min of 4 charactore")
	private String  district	;
	//@NotBlank
	//@Size(min=4,message = "district must be min of 4 charactore")
	private String  state	;
	//@NotBlank
//	@Size(min=4,message = "pincode must be min of 4 charactore")
	private Long  pincode	;
	//@NotBlank
	//@Size(min=4,message = "streetName must be min of 4 charactore")
	private String  streetName	;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
}
