package com.cjc.hl.enquiry.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.hl.enquiry.main.model.PropertyDocument;

public interface DocumentGetByCidRepository extends JpaRepository<PropertyDocument, Integer>{

	//PropertyDocument findByCusId(int cusId);

	PropertyDocument findBycId(int cId);

	
	
  
}

