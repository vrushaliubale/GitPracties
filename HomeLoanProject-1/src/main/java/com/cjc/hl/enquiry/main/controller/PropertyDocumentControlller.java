package com.cjc.hl.enquiry.main.controller;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.hl.enquiry.main.model.PropertyDocument;
import com.cjc.hl.enquiry.main.serviceI.PropDocumentService;
import com.google.gson.Gson;
@CrossOrigin("*")
@RestController
@RequestMapping("/propDocument")
public class PropertyDocumentControlller {

	
	@Autowired
	private PropDocumentService docservice;
	@PostMapping(value = "/docUpload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//	@PostMapping(value = "/docUpload",method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public PropertyDocument saveDoc(@RequestPart(required = true, value = "agreement") MultipartFile f1,
			@RequestPart(required = true, value="occupancyCertificate") MultipartFile f2,
			@RequestPart(required = true,value = "electricityBill") MultipartFile f3,
			@RequestPart(required = true,value = "propertyTax") MultipartFile f4,
			@RequestPart(required = true, value = "conveyanceDeed") MultipartFile f5,
			@RequestPart(required = true, value = "paymentReceiptAcStatement") MultipartFile f6,
			@RequestPart(value = "appFormwithPhotodulySigned") MultipartFile f7,
			@RequestPart(value = "last6monthBankStatements")MultipartFile f8,
			@RequestPart(value = "last3MonthSalarySlip") MultipartFile f9,
			@RequestPart(value = "processingFeeCheque") MultipartFile f10,
			@RequestPart(value = "form16") MultipartFile f11,
			@RequestPart(value = "proofOfBusinessExistence") MultipartFile f12,
			@RequestPart(value = "buisinessProfile") MultipartFile f13,
			@RequestPart(value = "educationQualification") MultipartFile f14,
			@RequestPart(value = "panCard") MultipartFile f15,
			@RequestPart(value = "adharCard")MultipartFile f16,
			@RequestPart(value = "ageProof")MultipartFile f17,
			@RequestPart(value = "residenceProof") MultipartFile f18,
			@RequestPart(value = "last3yrITRwithComputationofIncome") MultipartFile f19,
			@RequestPart(value = "last3yrCACertificate") MultipartFile f20,
			@RequestPart("doc") String doc) throws IOException
	{
		PropertyDocument pa=new PropertyDocument();
		
		pa.setAgreement(f1.getBytes());
		pa.setOccupancyCertificate(f2.getBytes());
		pa.setElectricityBill(f3.getBytes());
		pa.setPropertyTax(f4.getBytes());
		pa.setConveyanceDeed(f5.getBytes());
		pa.setPaymentReceiptAcStatement(f6.getBytes());
		pa.setAppFormwithPhotodulySigned(f7.getBytes());
		pa.setLast6monthBankStatements(f8.getBytes());
		pa.setLast3MonthSalarySlip(f9.getBytes());
		pa.setProcessingFeeCheque(f10.getBytes());
		pa.setForm16(f11.getBytes());
		pa.setProofOfBusinessExistence(f12.getBytes());
		pa.setBuisinessProfile(f13.getBytes());
		pa.setEducationQualification(f14.getBytes());
		pa.setPanCard(f15.getBytes());
		pa.setAdharCard(f16.getBytes());
		pa.setAgeProof(f17.getBytes());
		pa.setResidenceProof(f18.getBytes());
		pa.setLast3yrITRwithComputationofIncome(f19.getBytes());
		pa.setLast3yrCACertificate(f20.getBytes());
		
		
		Gson g=new Gson();
		PropertyDocument pd = g.fromJson(doc, PropertyDocument.class);
	    pa.setId(pd.getId());
	    pa.setcId(pd.getcId());
	   // System.out.println(pa.getCusId());
	    PropertyDocument propertyDocument = docservice.saveDoc(pa);
	    return propertyDocument;
	}
	@GetMapping("/documents")
	public Iterable<PropertyDocument> fetchallDocument(){
		Iterable<PropertyDocument> fetchAllDocument = docservice.fetchAllDocument();
		return fetchAllDocument;
	}
	@GetMapping("/document/{propDocId}")
	public PropertyDocument getDocumentById(@PathVariable int propDocId) {
		PropertyDocument fetchDocumentById = docservice.fetchDocumentById(propDocId);
		return fetchDocumentById;
	}
	@GetMapping("/documentByCid/{cId}")
	public PropertyDocument getDocumentByCusId(@PathVariable int cId) {
		 PropertyDocument fetchDocumentByCid = docservice.fetchDocumentByCid(cId);
		System.out.println(fetchDocumentByCid.getcId());
		return fetchDocumentByCid;
	}
	
	
	
	
	
	
}
