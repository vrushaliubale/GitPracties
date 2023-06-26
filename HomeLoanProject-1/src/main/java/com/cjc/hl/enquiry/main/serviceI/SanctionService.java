package com.cjc.hl.enquiry.main.serviceI;




import java.util.List;

import javax.validation.Valid;

import com.cjc.hl.enquiry.main.model.CustomerDetails;
import com.cjc.hl.enquiry.main.model.SanctionLetter;



public interface SanctionService {

	Integer saveSanctionLetter(SanctionLetter ac);

	List<SanctionLetter> getallSanctionLetter();

	SanctionLetter getallSanctionLetterById(int sanctionId);

	SanctionLetter updateSanctionLetter(SanctionLetter p);

	void deleteSanctionLetter(int sanctionId);

	

	//CustomerDetails savecustomer(@Valid CustomerDetails ac);

	//List<CustomerDetails> getallcustomer();

	void sendemail(CustomerDetails e);

	CustomerDetails updateCustomerDetails(CustomerDetails e);

	List<SanctionLetter> getSanctionDetailsunpaid(String emistatus);


	
	

	

}
