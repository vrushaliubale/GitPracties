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
public class PropertyInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id	;
	//@NotBlank
	//@Size(min=3,message = "propertyType must be min of 4 charactore")
	private String propertyType	;
	//@NotBlank
	//@Size(min=3,message = "propertyArea must be min of 4 charactore")
	private String propertyArea	;
	//@NotBlank
	//@Size(min=3,message = "constructionArea must be min of 4 charactore")
	private String constructionArea	;
//	@NotBlank
	//@Size(min=3,message = "propertyPrice must be min of 4 charactore")
	private Double propertyPrice;	
	//@NotBlank
	//@Size(min=3,message = "constructionPrice must be min of 4 charactore")
	private Double constructionPrice	;
//	@OneToOne(cascade =  CascadeType.ALL)
//	private PropertyDocument propertyDocuments	;
	//@NotBlank
//	@Size(min=3,message = "priceProofs must be min of 4 charactore")
	private int priceProofs	;
	@OneToOne(cascade =  CascadeType.ALL)
	private PropertyAddress propertyAddress	;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getPropertyArea() {
		return propertyArea;
	}
	public void setPropertyArea(String propertyArea) {
		this.propertyArea = propertyArea;
	}
	public String getConstructionArea() {
		return constructionArea;
	}
	public void setConstructionArea(String constructionArea) {
		this.constructionArea = constructionArea;
	}
	public Double getPropertyPrice() {
		return propertyPrice;
	}
	public void setPropertyPrice(Double propertyPrice) {
		this.propertyPrice = propertyPrice;
	}
	public Double getConstructionPrice() {
		return constructionPrice;
	}
	public void setConstructionPrice(Double constructionPrice) {
		this.constructionPrice = constructionPrice;
	}
	
	public int getPriceProofs() {
		return priceProofs;
	}
	public void setPriceProofs(int priceProofs) {
		this.priceProofs = priceProofs;
	}
	public PropertyAddress getPropertyAddress() {
		return propertyAddress;
	}
	public void setPropertyAddress(PropertyAddress propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	

}
