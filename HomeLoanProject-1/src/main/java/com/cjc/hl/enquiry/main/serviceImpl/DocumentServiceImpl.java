package com.cjc.hl.enquiry.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.hl.enquiry.main.model.Document;
import com.cjc.hl.enquiry.main.repository.DocumentRepository;
import com.cjc.hl.enquiry.main.serviceI.DocumentServiceI;
@Service
public class DocumentServiceImpl implements DocumentServiceI{
    @Autowired
    DocumentRepository   documentRepository;
	@Override
	public Document saveDoc(Document pa) {
		
		
		return documentRepository.save(pa);
		
	}

	@Override
	public Iterable<Document> fetchAllDocument() {
		List<Document> document=documentRepository.findAll();
		return document;
	}

	@Override
	public Document fetchDocumentById(int custID) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Document fetchDocumentById(int custID) {
//		Document did=documentRepository.findBycustId(custID);
//		did.getCusId();
//		System.out.println("Check"+did.getCusId());
//		
//		return did;
//	}

}
