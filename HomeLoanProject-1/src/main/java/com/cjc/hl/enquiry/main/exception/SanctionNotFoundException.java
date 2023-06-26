package com.cjc.hl.enquiry.main.exception;



public class SanctionNotFoundException extends RuntimeException {
	
	public SanctionNotFoundException()
	{	
	}
	
	public SanctionNotFoundException(String msg)
	{
		super(msg);
	}

}
