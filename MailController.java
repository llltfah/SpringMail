package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.config.MailConfig;
import com.app.model.MailModel;

@RestController
@RequestMapping("api/mail/")
public class MailController {
	
	@Autowired
	private MailConfig mc;
	
	@PostMapping("kirim") 
	public void kirim(@RequestBody MailModel mm){
		mc.kirim(mm.getTujuan(), mm.getSubject(), mm.getPesan());
	}

}