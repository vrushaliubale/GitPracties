package com.cjc.hl.enquiry.main.serviceI;

import java.util.List;

import com.cjc.hl.enquiry.main.model.DefaulterList;
import com.cjc.hl.enquiry.main.model.SanctionLetter;

public interface DefaulterListService {
	DefaulterList saveDefaulterList(DefaulterList dl);

	List<DefaulterList> getDefaulterList();

	//List<SanctionLetter> getSanctionDetailsunpaid(String emistatus);
}
