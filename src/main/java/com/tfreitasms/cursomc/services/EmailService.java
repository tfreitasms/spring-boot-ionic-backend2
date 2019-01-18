package com.tfreitasms.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.tfreitasms.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
