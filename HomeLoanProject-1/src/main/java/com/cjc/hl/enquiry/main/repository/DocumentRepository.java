package com.cjc.hl.enquiry.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.hl.enquiry.main.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {

//	Document findBycustId(int custID);

}
