package com.cjc.hl.enquiry.main.serviceI;

import java.util.List;

import com.cjc.hl.enquiry.main.model.DisbusmentLetter;

public interface DisbusmentLetterServiceI {
	DisbusmentLetter saveSanctionLetter(DisbusmentLetter ac);

	List<DisbusmentLetter> getallSanctionLetter();

	DisbusmentLetter getallSanctionLetterById(int sanctionId);

	DisbusmentLetter updateSanctionLetter(DisbusmentLetter p);

	void deleteSanctionLetter(int sanctionId);

}
