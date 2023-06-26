package com.cjc.hl.enquiry.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.hl.enquiry.main.model.CustomerVerification;
import com.cjc.hl.enquiry.main.serviceI.homeLoanServiceI;
@CrossOrigin("*")
@RestController
@RequestMapping("/home")
public class CustomerVerificationController {
	@Autowired
	homeLoanServiceI homeLoanServiceI;
	@PostMapping("/saveRemark")
	public CustomerVerification saveRemark(@RequestBody CustomerVerification cv) {
		
		CustomerVerification custVerification=homeLoanServiceI.saveCustRemark(cv);
		return custVerification;
	}
	
	@GetMapping("/getRemark/{id}")
	public CustomerVerification saveRemarkById(@PathVariable int id) {
		
		CustomerVerification custVerification=homeLoanServiceI.saveCustRemarkByid(id);
		return custVerification;
	}

}
