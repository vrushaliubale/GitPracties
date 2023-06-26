package com.cjc.hl.enquiry.main.serviceImpl;



import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cjc.hl.enquiry.main.exception.SanctionNotFoundException;
import com.cjc.hl.enquiry.main.model.CustomerDetails;
import com.cjc.hl.enquiry.main.model.EMIDetails;
import com.cjc.hl.enquiry.main.model.SanctionLetter;
import com.cjc.hl.enquiry.main.repository.CustomerDetailsRepository;
import com.cjc.hl.enquiry.main.repository.EmiRepository;
import com.cjc.hl.enquiry.main.repository.SanctionedRepository;
import com.cjc.hl.enquiry.main.serviceI.SanctionService;




@Service
public class SanctionServiceImpl implements SanctionService 
{
	
	@Autowired
	private SanctionedRepository sanctionrepository;
	
	@Autowired
	private CustomerDetailsRepository crepository;
	
	@Autowired
	JavaMailSender sender;
	@Autowired
	CustomerDetailsRepository cr;
	@Autowired
	EmiRepository  er;
	
	@Override
	public Integer saveSanctionLetter(SanctionLetter sc) 
	{
		
		double emi =((sc.getAmount() * (0.0058)) *Math.pow(1+(0.0058), sc.getLoanTenure()) / (Math.pow(1+(0.0058), sc.getLoanTenure())-1));
//	
//		sc.setMonthlyEmiAmount(emi);
//		System.out.println(emi);
//		SanctionLetter sd=sanctionrepository.save(sc);
//		
//		SanctionLetter scn=sanctionrepository.save(sc);
//		
//		String a=scn.getName();
//		System.out.println(a);
//		
//		SimpleMailMessage msg=new SimpleMailMessage();		
//		msg.setTo(sc.getEmail());
//	
//		msg.setFrom("pritibhosale4444@gmail.com");
//		msg.setSubject("Loan-sanction");
//		msg.setText("We are informing you that our bank has received your application for Home Loan. We are happy to inform you that your Home Loan request has been approved and is currently being processed.");
//		sender.send(msg);
//		return scn ;
		
		
	//double emi =((sc.getAmount() * sc.getRateOfInterest()) *Math.pow(1+sc.getRateOfInterest(), sc.getLoanTenure()) / (Math.pow(1+sc.getRateOfInterest(), sc.getLoanTenure())-1));
	sc.setMonthlyEmiAmount(emi);
	System.out.println(emi);
	sc.setStatus("sanction");
	sc.setStatus("sanction");
	SanctionLetter sd=sanctionrepository.save(sc);
	
	SimpleMailMessage msg=new SimpleMailMessage();		
	msg.setTo(sd.getEmail());

		msg.setFrom("pranjalimakh@gmail.com");
		msg.setSubject("Laonsnction");
		msg.setText("loan");
		sender.send(msg);
		CustomerDetails cd = new CustomerDetails();
		
		BeanUtils.copyProperties(sc, cd);
		System.out.println(cd);
		cd.setId(sc.getCid());
		CustomerDetails save = cr.save(cd);
	
		double princi=	sc.getAmount();
	for (int i = 1; i <= sc.getLoanTenure(); i++) {
		EMIDetails e = new EMIDetails ();
		e.setBalance(princi);
		e.setCustomerId(sc.getCid());
		LocalDate now = LocalDate.of(2022, 6, 22);
		e.setPaymentdate(now.plusMonths(i));
		e.setPaymentNumber(i);
		if (sc.getAmount() > emi) {
			e.setEmiPaid(emi);
		} else {
			e.setEmiPaid(sc.getAmount());
		}
		double dd = princi - (emi-sc.getRateOfInterest()*princi);
		// System.out.println(dd);
		//double  dd = s.getSanctionAmount() - (emi);
		e.setStatus("Pending");
	
		princi = dd;
		
		 er.save(e);

	}
	return save.getId();
		
		
		
		
		
		
		
		
	}

	@Override
	public List<SanctionLetter> getallSanctionLetter() 
	{
		List<SanctionLetter> sanctionLetter=sanctionrepository.findAll();
		return sanctionLetter;
	}

	@Override
	public SanctionLetter getallSanctionLetterById(int sanctionId) 
	{
		 Optional<SanctionLetter> optional=sanctionrepository.findById(sanctionId);
			
			if(optional.isPresent())
			{
				SanctionLetter sanction=optional.get();
				return sanction;
			}
			throw new SanctionNotFoundException();
			
		
	}
	
	@Override
	public SanctionLetter updateSanctionLetter(SanctionLetter p) 
	{
		SanctionLetter sanction=sanctionrepository.save(p);	
			return sanction;
	}

	@Override
	public void deleteSanctionLetter(int sanctionId) 
	{
		sanctionrepository.deleteById(sanctionId);
		
	}
	

	@Override
	public void sendemail(CustomerDetails e) 
	{
		SimpleMailMessage msg=new SimpleMailMessage();		
		msg.setTo(e.getEmail());
		//msg.setTo("vrushaliubale7@gmail.com");
	// String a=e.getEmail();
//		// System.out.println(a);
	//msg.setFrom("pritibhosale4444@gmail.com");
	msg.setSubject("Laonsnction");
	msg.setText("loan");
		sender.send(msg);
	}

//	@Override
//	public CustomerDetails savecustomer(@Valid CustomerDetails ac) {
//		CustomerDetails scn=crepository.save(ac);
//		
//		
//		return scn;
//	}
//
//	@Override
//	public List<CustomerDetails> getallcustomer() {
//		List<CustomerDetails> customer=crepository.findAll();
//		return customer;
//		
//	}
//
	@Override
	public CustomerDetails updateCustomerDetails(CustomerDetails e) {
		CustomerDetails customer= crepository.save(e);
		return customer;
	}
	

	@Override
	public List<SanctionLetter> getSanctionDetailsunpaid(String emistatus) {
		List<SanctionLetter> list1=sanctionrepository.findAllByEmistatus(emistatus);
		
		return list1;
		
	}


	

	

}
