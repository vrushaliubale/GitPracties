package com.cjc.hl.enquiry.main.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.hl.enquiry.main.serviceI.LedgerServiceI;

@RestController
public class LedgerController {
	@Autowired
	LedgerServiceI ledgerSirviceI;

	@GetMapping("/excel")
	public void excel(HttpServletResponse response) {
		
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment;filename=data.xls");
		try {
			ledgerSirviceI.excel(response);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	

		}
	}
}