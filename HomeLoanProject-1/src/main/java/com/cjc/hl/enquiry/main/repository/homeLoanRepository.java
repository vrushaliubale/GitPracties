package com.cjc.hl.enquiry.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.hl.enquiry.main.model.EnquiryDetails;

@Repository
public interface homeLoanRepository extends JpaRepository<EnquiryDetails, Integer> {

}
