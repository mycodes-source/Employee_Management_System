package com.project.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.project.entity.Email;
import com.project.repository.EmailRepository;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailsender;
	
	@Autowired
	private EmailRepository emailrepository;
	
	private void sendEmail(String to,String subject,String body) {
		Email e = new Email();
		
		e.setRecipient(to);
		e.setSubject(subject);
		e.setMessage(body);
		e.setSentAt(LocalDateTime.now());
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(to);
			message.setSubject(subject);
			message.setText(body);
			
			mailsender.send(message);
			e.setStatus("Success");
		}
		catch(Exception ex) {
			e.setStatus("Failure");
			System.out.println(ex.getMessage());
		}
		emailrepository.save(e);
	}
	public void sendResetLink(String toEmail,String resetLink) {
		String subject = "Password Reset Link";
		
		String body = "Hello \n\n Cick the below reset link to reset your password\n" + resetLink +"\n\n If you did not request this please ignore this email";
		sendEmail(toEmail, subject, body);
		
	}
	
}
