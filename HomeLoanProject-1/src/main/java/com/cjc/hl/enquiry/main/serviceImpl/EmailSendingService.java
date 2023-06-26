package com.cjc.hl.enquiry.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSendingService {
	@Autowired
	public JavaMailSender javamailsender;
	
	public void send(int cibilScore)
	{
		SimpleMailMessage m=new SimpleMailMessage();
		m.setTo("vrushaliubale7@gmail.com");
		
		if(cibilScore <= 700) {
			m.setSubject("Sorry we cannot approve your loan");
			m.setText("Sorry we cannot approve your loan as your cibil score is Too Low " + cibilScore);
		} else {
			m.setSubject("We are glad to offer you loan");
			m.setText("We are glad to offer you loan . Your cibil score is "+cibilScore);
		}
		
		javamailsender.send(m);
		
	}
	
	public void sendToCid(String remark) {
		SimpleMailMessage m1=new SimpleMailMessage();
		String a="Verified";
		//String b="Rejected";
		if(remark.equals(a)==true) {
		m1.setTo("vrushaliubale7@gmail.com");
		m1.setSubject(" Document Varification ");
		m1.setText("Your Document is Varification "+remark );
		}
		else{
			m1.setTo("vrushaliubale7@gmail.com");
			m1.setSubject(" Document Varification ");
			m1.setText("Your Document is Varification " +remark);
		}
		System.out.println(m1);
		javamailsender.send(m1);
	
		
	}
}