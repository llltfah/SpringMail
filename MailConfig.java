package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailConfig {

	@Autowired
	private JavaMailSender javaMailSender;
	
	//sending method
	public void kirim(String to, String subject, String body) {
		//variable message
		SimpleMailMessage pesan = new SimpleMailMessage();
		
		//isi pesan
		pesan.setTo(to);
		pesan.setSubject(subject);
		pesan.setText(body);
		
		//kirim pesan
		javaMailSender.send(pesan);
	}
}
