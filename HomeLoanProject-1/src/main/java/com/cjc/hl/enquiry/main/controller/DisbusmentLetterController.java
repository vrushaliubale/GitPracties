package com.cjc.hl.enquiry.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.cjc.hl.enquiry.main.model.DisbusmentLetter;
import com.cjc.hl.enquiry.main.serviceImpl.DisbusmentLetterServiceImpl;

@RestController
@RequestMapping("/home")
public class DisbusmentLetterController {
	@Autowired
	DisbusmentLetterServiceImpl service;
	@PostMapping("/saveSanctionLetter")
	public String saveSanctionLetter(@Valid @RequestBody DisbusmentLetter ac)
	{
		DisbusmentLetter sanction=service.saveSanctionLetter(ac);
		//SanctionalDetails sd=service.saveEmiCalculate(s);
		//List<SanctionLetter> list=service.getallSanctionLetter();
		return " data saved successfully";
		
		
	}
	
	@GetMapping("/getAllSanctionLetter")
	public List<DisbusmentLetter> getallSanctionLetter()
	{
		List<DisbusmentLetter> sanctionLetter=service.getallSanctionLetter();
		return sanctionLetter;
	}
	
	@GetMapping("/getAllSanctionLetter/{sanctionId}")
	public DisbusmentLetter getallSanctionLetterById(@PathVariable int sanctionId)
	{
		DisbusmentLetter sanction=service.getallSanctionLetterById(sanctionId);
		return sanction;
	}
	
	@PutMapping("/updateSanctionLetter")
	public String updateSanctionLetter(@RequestBody DisbusmentLetter p)
	{
		DisbusmentLetter pro=service.updateSanctionLetter(p);
		return"updated";
		
	}
	
	@DeleteMapping("/delete/{sanctionId}")
	public String DeleteSanctionLetter(@PathVariable  int sanctionId )
	{
		service.deleteSanctionLetter(sanctionId);
		return "deleted";
	}
	
	//====================================================================================
	
//	@PostMapping("/savecustomer")
//	public String Savecustomer(@Valid @RequestBody CustomerDetails ac)
//	{
//		CustomerDetails customer=service.savecustomer(ac);
//		return " data saved successfully";	
//	}
//	
//	@GetMapping("/getAllcustomer")
//	public List<CustomerDetails> getallcustomer()
//	{
//		List<CustomerDetails> customer=service.getallcustomer();
//		return customer;
//	}
//	
//	@PutMapping("/updateCustomer/{custId}")
//	public String editdata(@RequestBody CustomerDetails e )
//	{
//		CustomerDetails e1=service.updateCustomerDetails(e);
//		return "update CustomerDetails successfully";
//	}
//	
	
	
	
	
//	@Value("${spring.mail.username}")
//	private String from;	
////	// http://localhost:7878
//	@PostMapping("/sendemail")
//	public String sendMsg(@RequestBody CustomerDetails e)
//	{
//	
//	try {
//			
//			service.sendemail(e);
//			return "Email Sent Successfully";
//			
//		}
//	catch (Exception e2) {
//			return "Email not Sent";
//		}
//	}
//	
	
	@GetMapping(value = "/getemi/{principal}/{month}")
	public double emiCal(@PathVariable double principal,@PathVariable double month) 
	{
		double interest=(double)0.58/100 ;
		System.out.println(principal);
		System.out.println(month);
		
	double	emi =((principal * interest) *Math.pow(1+interest, month) / (Math.pow(1+interest, month)-1));
		
		return emi;
	}
	
	
	
	
	
	
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
	}
	
}


