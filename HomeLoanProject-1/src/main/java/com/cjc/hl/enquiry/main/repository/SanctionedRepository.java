package com.cjc.hl.enquiry.main.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.hl.enquiry.main.model.EMIDetails;
import com.cjc.hl.enquiry.main.model.SanctionLetter;



@Repository
public interface SanctionedRepository extends JpaRepository<SanctionLetter, Integer>  {

	List<SanctionLetter> findAllByEmistatus(String emistatus);

	void save(EMIDetails e);

	Optional<SanctionLetter> findByCid(int i);

	
	

}
