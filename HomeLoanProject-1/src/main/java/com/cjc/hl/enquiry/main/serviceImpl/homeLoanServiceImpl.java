package com.cjc.hl.enquiry.main.serviceImpl;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.hl.enquiry.main.exception.LowCibilScoreException;
import com.cjc.hl.enquiry.main.exception.VerificationFaliedException;
import com.cjc.hl.enquiry.main.exception.inValiedUSer;
import com.cjc.hl.enquiry.main.model.Cibil;
import com.cjc.hl.enquiry.main.model.CustomerDetails;
import com.cjc.hl.enquiry.main.model.CustomerVerification;
import com.cjc.hl.enquiry.main.model.DefaulterList;
import com.cjc.hl.enquiry.main.model.Document;
import com.cjc.hl.enquiry.main.model.EMIDetails;
import com.cjc.hl.enquiry.main.model.EnquiryDetails;
import com.cjc.hl.enquiry.main.model.Ledger;
import com.cjc.hl.enquiry.main.model.SanctionLetter;
import com.cjc.hl.enquiry.main.repository.CibilRepository;
import com.cjc.hl.enquiry.main.repository.CustomerDetailsRepository;
import com.cjc.hl.enquiry.main.repository.CustomerVerificationRepository;
import com.cjc.hl.enquiry.main.repository.DefaulterListRepository;
import com.cjc.hl.enquiry.main.repository.DocumentRepository;
import com.cjc.hl.enquiry.main.repository.EmiRepository;
import com.cjc.hl.enquiry.main.repository.SanctionedRepository;
import com.cjc.hl.enquiry.main.repository.homeLoanRepository;
import com.cjc.hl.enquiry.main.serviceI.homeLoanServiceI;

@Service
public class homeLoanServiceImpl implements homeLoanServiceI {
@Autowired
homeLoanRepository homeLoanRepository;
@Autowired
CustomerDetailsRepository customerDetailsRepository;
@Autowired
DocumentRepository documentRepository;
@Autowired
CustomerVerificationRepository customerVerificationRepository;
//@Autowired
//CibilRepository cibilRepository;
@Autowired
EmiRepository emiRepository;
@Autowired
EmailSendingService emailSendingService;
@Autowired
DefaulterListRepository df;

@Autowired
SanctionedRepository sr;


	@Override
	public EnquiryDetails saveEnquiryDetails(EnquiryDetails ed) {
		EnquiryDetails e=homeLoanRepository.save(ed);
		return e;
	}

	@Override
	public CustomerDetails saveCustomerDetails(CustomerDetails cd) {
		
		System.out.println(cd.getStatus());
		String a="Accepted";
		if(a.equals(cd.getStatus())==true) {
			CustomerDetails custd=customerDetailsRepository.save(cd);
			return custd;
		}	
		
		throw new inValiedUSer();
		
	}

	@Override
	public String uploadDoc(Document cust) {
		documentRepository.save(cust);
		// TODO Auto-generated method stub
		return "DocumentUploaded...";
		
	}

	@Override
	public List<CustomerDetails> getCustomerDetails() {
          List<CustomerDetails> d=customerDetailsRepository.findAll();
		return d;
	}

	

	@Override
	public List<EnquiryDetails> getEnquiryDetails() {
		 List<EnquiryDetails> getEnquiryDetails=homeLoanRepository.findAll();
		return getEnquiryDetails;
	}

	@Override
	public EnquiryDetails getEnquiryDetailsById(int id) {
		  Optional<EnquiryDetails> pOptional=homeLoanRepository.findById(id);
		  if(pOptional.isPresent()) {
	    	  
	    	  EnquiryDetails p=pOptional.get();
	    	  return p;
	      }
		return pOptional.get();
	}

	@Override
	public CustomerDetails getCustomerDetailsById(int id) {
		Optional<CustomerDetails> pOptional=customerDetailsRepository.findById(id);
		  if(pOptional.isPresent()) {
	    	  
			  CustomerDetails p=pOptional.get();
	    	  return p;
	      }
		return pOptional.get();
	}

	@Override
	public Cibil checkCibilScore(Cibil cibil) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCibilWithEnquiry(EnquiryDetails e) {
      Random r=new Random();
		System.out.println(e);
		int cibilScore=r.nextInt(700-650)+650;
		emailSendingService.send(cibilScore);
		e.setCibilScore(cibilScore);
		if(cibilScore<600) {
			e.setStatus("Rejected");
			//throw new LowCibilScoreException("You have low cibil Score "+cibilScore);
		}
		else if(cibilScore>=600 && cibilScore<650){
			e.setStatus("Pending");
		}
		else if(cibilScore>=650){
			e.setStatus("Accepted");
		}
		System.out.println(cibilScore+e.getStatus());
		
		homeLoanRepository.save(e);
		
	}

	@Override
	public List<EnquiryDetails> fetchAllEnquiry() {
		List<EnquiryDetails> fetchAllEnquiryDetails=homeLoanRepository.findAll();
		return fetchAllEnquiryDetails;
		
		
	}

	@Override
	public CustomerVerification saveCustRemark(CustomerVerification cv) {
		String status="Verified";
		String status2="Rejected";
		System.out.println("Check Remark"+cv.getRemarks());
		if(status.equals(cv.getRemarks())==true) {
			//cv.setRemarks("Verified");
			emailSendingService.sendToCid(status);
		    CustomerVerification verification=customerVerificationRepository.save(cv);
			return verification;
		}
		else if(status2.equals(cv.getRemarks())==true) {
		emailSendingService.sendToCid(status);
		}
		throw new VerificationFaliedException();

	}

	@Override
	public CustomerVerification saveCustRemarkByid(int id) {
		Optional<CustomerVerification> optional=customerVerificationRepository.findById(id);
		if(optional.isPresent()) {
			CustomerVerification c=optional.get();
			return c;
		}
		return optional.get();
	}

	@Override
	public List<EMIDetails> getEmiByCid(int cid) {
		
		return emiRepository.findAllByCustomerId(cid);
	}

	@Override
	public void updateStatus(Integer id, LocalDate date) {
		
		List<EMIDetails> all = emiRepository.findAllByCustomerId(id);
		// Stream<EmiCalculation> filter = all.stream().filter(p ->
		// p.getAtatus().equalsIgnoreCase("pending"));
		for (EMIDetails e : all) {
			if (e.getPaymentdate().equals(date)) {
				e.setStatus("Paid");
			} else if (e.getPaymentdate().isBefore(LocalDate.now()) &&e.getStatus().equalsIgnoreCase("pending")) {
				e.setStatus("Not Paid");
			}
			emiRepository.save(e);
		}
	}
	
	@Override
	public Set<SanctionLetter> findDefaulterCustomer() {
		List<EMIDetails> all = emiRepository.findAll();
		Set<SanctionLetter> defa  =new HashSet();
		int s=0;
		String name="";
		 Set<String> s1=new HashSet<>();
		int i = 0;
		
			for (EMIDetails e : all) {				
				if (e.getPaymentdate().isBefore(LocalDate.now())) {
					if (e.getStatus().equalsIgnoreCase("Not Paid") || e.getStatus().equalsIgnoreCase("pending")) {
						i++;
						System.out.println("Not Paid Count Is:"+i);
					}else{
						i=0;
					}						
				}
				
				
				if(i>=3) {
					s++;
					Integer customerId = e.getCustomerId();
					System.out.println("customer id is:"+customerId);
    				 Optional<SanctionLetter> findById = sr.findByCid(customerId);
				    System.out.println("findByID----:"+findById);
					if(findById.isPresent()) {
						SanctionLetter customerDetail=findById.get();
						defa.add(customerDetail);
						System.out.println(customerDetail.getName());
						
					}
					//Optional<T>
				}
			}
			//return defa;
			return defa;
			
	}

//	@Override
//	public void excel(HttpServletResponse req) throws IOException {
//	List<Ledger> list = homeLoanRepository.findAll();
//		
//		HSSFWorkbook workbook=new HSSFWorkbook();
//		HSSFSheet sheet = workbook.createSheet();
//		HSSFRow header = sheet.createRow(0);
//		header.createCell(0).setCellValue("PaymentNo");
//		header.createCell(1).setCellValue("PaymentDate");
//		header.createCell(2).setCellValue("Balance");
//		header.createCell(3).setCellValue("EmiPaid");
//		header.createCell(4).setCellValue("status");
//		//HSSFCellStyle style = workbook.createCellStyle();
//		//style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//		//style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//		//header.setRowStyle(style);
//		int i=1;
//		for(Ledger p:list) {			
//			HSSFRow row = sheet.createRow(i);
//			row.createCell(0).setCellValue(p.getLedgeRid());
//			row.createCell(1).setCellValue(p.getLedgerCreatedDate());
//			row.createCell(2).setCellValue(p.getLedgerRemainingAmount());
//			row.createCell(3).setCellValue(p.getLedgerMonthlyEmi());
//			row.createCell(4).setCellValue(p.getLedgerEmiStatus());
//			i++;
//		}
//		
//		ServletOutputStream stream=req.getOutputStream();
//		workbook.write(stream);
//		workbook.close();
//		stream.close();
//		
//	}
		
	//}

	

	
	

}
