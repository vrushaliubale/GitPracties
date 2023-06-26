package com.cjc.hl.enquiry.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.hl.enquiry.main.model.DefaulterList;
import com.cjc.hl.enquiry.main.model.SanctionLetter;
import com.cjc.hl.enquiry.main.repository.DefaulterListRepository;
import com.cjc.hl.enquiry.main.serviceI.DefaulterListService;

@Service
public class DefaulterListServiceImpl  implements DefaulterListService{

	@Autowired
	DefaulterListRepository repo;

	@Override
	public DefaulterList saveDefaulterList(DefaulterList dl) {
		DefaulterList dlist=repo.save(dl);
		return dlist;
	}

	@Override
	public List<DefaulterList> getDefaulterList() {
		List<DefaulterList> list=repo.findAll();
		return list;
	}

	//@Override
//	public List<SanctionLetter> getSanctionDetailsunpaid(String emistatus) {
//		
//		//List<SanctionalDetails> list=repo.findAll();
////		System.out.println(s.getCustomerBankName());
//		//List<SanctionLetter> list1=repo.findAllByEmiStatus(emistatus);
//			
//			return list1;
//	}
	

}
