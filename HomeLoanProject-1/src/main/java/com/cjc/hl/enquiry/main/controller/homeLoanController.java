package com.cjc.hl.enquiry.main.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.hl.enquiry.main.model.CustomerDetails;
import com.cjc.hl.enquiry.main.model.DefaulterList;
import com.cjc.hl.enquiry.main.model.EMIDetails;
import com.cjc.hl.enquiry.main.model.EnquiryDetails;
import com.cjc.hl.enquiry.main.model.SanctionLetter;
import com.cjc.hl.enquiry.main.serviceI.homeLoanServiceI;



@RestController
@RequestMapping("/homeloan")
@CrossOrigin("*")
public class homeLoanController {
	@Autowired
	homeLoanServiceI serviceI;
	
	@PostMapping("/save")
	public  EnquiryDetails saveEnquiryDetails (@RequestBody EnquiryDetails ed) {
		
		EnquiryDetails enq=serviceI.saveEnquiryDetails(ed);
		
		return enq;
		
		
	} 
	@PostMapping("/cibil")
	public  List<EnquiryDetails> getAllEnquiryDataWithCibil(@RequestBody EnquiryDetails data) {
		System.out.println("in save enquiry with cibil");
		serviceI.saveCibilWithEnquiry(data);
//		System.out.println("in save enquiry with cibil");
	List<EnquiryDetails>  allEnquiryDetails=serviceI.fetchAllEnquiry();
//		
		return allEnquiryDetails;
		
		
	} 
	@GetMapping("/get")
	public  List<EnquiryDetails> getEnquiryDetails ( ) {
		
		List<EnquiryDetails>  enq=serviceI.getEnquiryDetails();
		
		return enq;
		
		
	} 
	
	
	@GetMapping("/getById/{id}")
	public  EnquiryDetails getEnquiryDetailsById (@PathVariable int id ) {
		
		EnquiryDetails enq=serviceI.getEnquiryDetailsById(id);
		
		return enq;
		
		
	}
	
	
//	@GetMapping("/defa")
//	public Set<EMIDetails> findDefaulder() {
//		 Set<EMIDetails> set = serviceI.findDefaulterCustomer();
//		return set;
//	}
	
	
	
	
	@GetMapping("/defa")
	public ResponseEntity<Set<SanctionLetter>> findDefaulder() {
		 Set<SanctionLetter> set = serviceI.findDefaulterCustomer();
		return new ResponseEntity<>(set, HttpStatus.OK);
	}
	
//	@PostMapping("/saveEnquiry/cibil")
//	public List<EnquiryDetails> getAllEnquiryDataWithCibil(@RequestBody data){
//		homeLoanServiceI.saveCibilWithEnquiry(data);
//		
//		
//	}
	

}
