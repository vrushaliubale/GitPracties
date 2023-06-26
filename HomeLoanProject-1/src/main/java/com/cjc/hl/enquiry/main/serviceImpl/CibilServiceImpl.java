package com.cjc.hl.enquiry.main.serviceImpl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.hl.enquiry.main.exception.LowCibilScoreException;
import com.cjc.hl.enquiry.main.model.Cibil;
import com.cjc.hl.enquiry.main.model.CustomerDetails;
import com.cjc.hl.enquiry.main.model.Document;
import com.cjc.hl.enquiry.main.model.EnquiryDetails;
import com.cjc.hl.enquiry.main.repository.CibilRepository;
import com.cjc.hl.enquiry.main.serviceI.InterfaceCibilService;
import com.cjc.hl.enquiry.main.serviceI.homeLoanServiceI;



@Service
public class CibilServiceImpl implements InterfaceCibilService {
	@Autowired
	CibilRepository repo;
	@Autowired
	EmailSendingService emailSendingService;

	@Override
	public Cibil saveData(Cibil a) {
		Random random=new Random();
		int randomCibilScore = random.nextInt(750-650)+650;
		emailSendingService.send(randomCibilScore);
		if (randomCibilScore <= 700) {
			throw new LowCibilScoreException("You have low cibil Score"+randomCibilScore);
		}
		a.setCibilScore(randomCibilScore);
		Cibil cibil=repo.save(a);
		return cibil;
	}

	@Override
	public List<Cibil> getData() {
		List<Cibil> clist=repo.findAll();
		return clist;
	}

	@Override
	public Cibil updateData(Cibil a) {
		return repo.save(a);
	}

	@Override
	public void deleteData(int id) {
		repo.deleteById(id);
		
	}

	
	



	
}
