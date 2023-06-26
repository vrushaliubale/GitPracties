package com.cjc.hl.enquiry.main.serviceI;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import com.cjc.hl.enquiry.main.model.Cibil;
import com.cjc.hl.enquiry.main.model.CustomerDetails;
import com.cjc.hl.enquiry.main.model.CustomerVerification;
import com.cjc.hl.enquiry.main.model.DefaulterList;
import com.cjc.hl.enquiry.main.model.Document;
import com.cjc.hl.enquiry.main.model.EMIDetails;
import com.cjc.hl.enquiry.main.model.EnquiryDetails;
import com.cjc.hl.enquiry.main.model.SanctionLetter;

public interface homeLoanServiceI {

	EnquiryDetails saveEnquiryDetails(EnquiryDetails ed);

	CustomerDetails saveCustomerDetails(CustomerDetails cd);

	public String uploadDoc(Document cust);

	public List<CustomerDetails> getCustomerDetails();

	public Cibil checkCibilScore(Cibil cibil);

	public List<EnquiryDetails> getEnquiryDetails();

	public EnquiryDetails getEnquiryDetailsById(int id);

	public CustomerDetails getCustomerDetailsById(int id);

	public void saveCibilWithEnquiry(EnquiryDetails data) ;

	public List<EnquiryDetails> fetchAllEnquiry() ;

	public CustomerVerification saveCustRemark(CustomerVerification cv);

	CustomerVerification saveCustRemarkByid(int id);

	List<EMIDetails> getEmiByCid(int cid);

	void updateStatus(Integer id, LocalDate parse);

	public Set<SanctionLetter> findDefaulterCustomer();
	



//	public CustomerDetails getCustomerDetailsById(int id);
//	public Cibil saveData(Cibil a);
//	public List<Cibil> getData();
//	public Cibil updateData(Cibil a);
//	public void deleteData(int id);

}
