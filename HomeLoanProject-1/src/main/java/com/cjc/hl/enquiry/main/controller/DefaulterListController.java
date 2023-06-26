package com.cjc.hl.enquiry.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.hl.enquiry.main.model.DefaulterList;
import com.cjc.hl.enquiry.main.serviceImpl.DefaulterListServiceImpl;

@RestController
@CrossOrigin("*")
public class DefaulterListController {
@Autowired
	
	DefaulterListServiceImpl service;
	
	@PostMapping("/postDefaulterList")
	public String saveDefaulterList(@RequestBody DefaulterList dl)
	{
		DefaulterList dlist=service.saveDefaulterList(dl);
		return dlist.getDefaulterId()+" Saved In Database";
	}
	
	@GetMapping("/getDefaulterList")
	public List<DefaulterList> getDefaulterList()
	{
		List<DefaulterList> list=service.getDefaulterList();
		return list;
	}
}
