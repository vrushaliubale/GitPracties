package com.cjc.hl.enquiry.main.serviceImpl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.hl.enquiry.main.model.Ledger;
import com.cjc.hl.enquiry.main.repository.LedgerRepository;
import com.cjc.hl.enquiry.main.serviceI.LedgerServiceI;

@Service
public class LegerServiceImpl  implements LedgerServiceI{
   @Autowired
   LedgerRepository repo;
	@Override
	public void excel(HttpServletResponse req) throws IOException {
		
		List<Ledger> list = repo.findAll();
		
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		HSSFRow header = sheet.createRow(0);
		header.createCell(0).setCellValue("PaymentNo");
		header.createCell(1).setCellValue("PaymentDate");
		header.createCell(2).setCellValue("Balance");
		header.createCell(3).setCellValue("EmiPaid");
		header.createCell(4).setCellValue("status");
		//HSSFCellStyle style = workbook.createCellStyle();
		//style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		//style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		//header.setRowStyle(style);
		int i=1;
		for(Ledger p:list) {			
			HSSFRow row = sheet.createRow(i);
			row.createCell(0).setCellValue(p.getLedgerId());
			row.createCell(1).setCellValue(p.getLedgerCreatedDate());
			row.createCell(2).setCellValue(p.getRemainingAmount());
			row.createCell(3).setCellValue(p.getMonthlyEMI());
			row.createCell(4).setCellValue(p.getCurrentMonthEMIstatus());
			i++;
		}
		
		ServletOutputStream stream=req.getOutputStream();
		workbook.write(stream);
		workbook.close();
		stream.close();
		
	}

}
