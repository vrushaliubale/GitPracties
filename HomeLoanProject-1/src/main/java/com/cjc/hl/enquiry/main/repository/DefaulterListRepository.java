package com.cjc.hl.enquiry.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.hl.enquiry.main.model.DefaulterList;

@Repository
public interface DefaulterListRepository extends JpaRepository<DefaulterList, Integer> {

//	List<SanctionLetter> findAllByEmiStatus(String emistatus);

}
