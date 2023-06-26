package com.cjc.hl.enquiry.main.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.hl.enquiry.main.exception.LowCibilScoreException;
import com.cjc.hl.enquiry.main.model.Cibil;
import com.cjc.hl.enquiry.main.serviceI.InterfaceCibilService;
import com.cjc.hl.enquiry.main.serviceI.homeLoanServiceI;

@RestController
@RequestMapping("/home")
@CrossOrigin("*")
public class CibilSourceController {
	@Autowired
	InterfaceCibilService service;
	
	@PostMapping("/saveCibilData")
	public String saveLoanData(@Valid @RequestBody Cibil cibil)
	{
		Cibil loan=service.saveData(cibil);
		return "Data Save SuccessFully!!";
	}
	
	@GetMapping("/getCibilData")
	public List<Cibil> getcibilData()
	{
		List<Cibil> cibilList=service.getData();
		return cibilList;
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
		System.out.println("inside excepton handling");
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
		System.out.println("inside excepton handling"+errors);
	    return errors;
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(LowCibilScoreException.class)
	public Map<String, String> handleLowCibilScoreException(LowCibilScoreException e) {
		Map<String, String> errors = new HashMap<>();
        String errorMessage = e.getMessage();
        errors.put("cibil score", errorMessage);
		return errors;
	}
	

	

}
