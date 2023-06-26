package com.cjc.hl.enquiry.main.GlobalException;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.UnexpectedTypeException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cjc.hl.enquiry.main.exception.LowCibilScoreException;
import com.cjc.hl.enquiry.main.exception.SanctionNotFoundException;
import com.cjc.hl.enquiry.main.exception.VerificationFaliedException;
import com.cjc.hl.enquiry.main.exception.inValiedUSer;


@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleMethodArgsNotValidException(MethodArgumentNotValidException ex){
		
		Map<String, String> resp=new HashMap<>();
		
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String fieldName=((FieldError)error).getField();
			String message=error.getDefaultMessage();
			resp.put(fieldName, message);
		});
		return new ResponseEntity<Map<String,String>>(resp,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(value=inValiedUSer.class)
	public String  inValiedUSer() {
		return "Invalied User";
		
	}
	
	@ExceptionHandler(value=VerificationFaliedException.class)
	public String  VerificationFaliedException() {
		return " User Verification Falied ";
		
	}
	@ExceptionHandler(value = SanctionNotFoundException.class)
	public String SanctionNotFoundExceptionHandler()
	{
		return"Sanction not found";
		
	}
	
//	 @ExceptionHandler(HttpMessageNotReadableException.class)
//	    public ResponseEntity<String> handleException(HttpMessageNotReadableException exception, HttpServletRequest request) {
//	        return new ResponseEntity("You gave an incorrect value for ....", HttpStatus.BAD_REQUEST);
//	    }
	
	
//	@ExceptionHandler(UnexpectedTypeException.class)
//	public ResponseEntity<CustomerDetails> unexpectedTypeException(UnexpectedTypeException ux){
//		//ux.
//		return null;
//		
//	
//	}

//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public Map<String, String> handleValidationExceptions(
//	  MethodArgumentNotValidException ex) {
//		System.out.println("inside excepton handling");
//	    Map<String, String> errors = new HashMap<>();
//	    ex.getBindingResult().getAllErrors().forEach((error) -> {
//	        String fieldName = ((FieldError) error).getField();
//	        String errorMessage = error.getDefaultMessage();
//	        errors.put(fieldName, errorMessage);
//	    });
//		System.out.println("inside excepton handling"+errors);
//	    return errors;
//	}
//	
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(LowCibilScoreException.class)
//	public Map<String, String> handleLowCibilScoreException(LowCibilScoreException e) {
//		Map<String, String> errors = new HashMap<>();
//        String errorMessage = e.getMessage();
//        errors.put("cibil score", errorMessage);
//		return errors;
//	}
}
