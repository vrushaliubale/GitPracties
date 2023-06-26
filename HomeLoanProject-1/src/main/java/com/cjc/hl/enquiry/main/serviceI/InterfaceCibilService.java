package com.cjc.hl.enquiry.main.serviceI;

import java.util.List;

import com.cjc.hl.enquiry.main.model.Cibil;



public interface InterfaceCibilService {
	public Cibil saveData(Cibil a);
	public List<Cibil> getData();
	public Cibil updateData(Cibil a);
	public void deleteData(int id);
	
}
