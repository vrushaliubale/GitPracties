package com.cjc.hl.enquiry.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.hl.enquiry.main.model.EMIDetails;

@Repository
public interface EmiRepository extends JpaRepository<EMIDetails, Integer>{
	public List<EMIDetails> findAllByCustomerId(Integer id);

	//public void findAllByCid(int cid);

}
