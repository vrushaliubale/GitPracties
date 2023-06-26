package com.cjc.hl.enquiry.main.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.hl.enquiry.main.model.EMIDetails;
import com.cjc.hl.enquiry.main.serviceI.homeLoanServiceI;

@RestController 
@CrossOrigin("*")
public class EMIDetailsController {
	@Autowired
	homeLoanServiceI loanServiceI;
	@GetMapping("getEmiByCid/{customerId}")
	public List<EMIDetails> getEmiByCid(@PathVariable int customerId){
		List<EMIDetails> emi=loanServiceI.getEmiByCid(customerId);
				
			return emi;	
				
				
		
	}
	
	@GetMapping("/update/{date}/{id}")
	public ResponseEntity<String> updateStatus(@PathVariable String date,@PathVariable Integer id) {
		LocalDate parse = LocalDate.parse(date);
		loanServiceI.updateStatus(id,parse);
		return new ResponseEntity<>("Status Update", HttpStatus.OK);
	}

}
