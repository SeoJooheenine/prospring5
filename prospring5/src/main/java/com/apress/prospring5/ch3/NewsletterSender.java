package com.apress.prospring5.ch3;

public interface NewsletterSender {
	void setSmtpServer(String smtpServer);
	String getSmtpServer();
	void setFromaddress(String fromAddress);
	String getFromAddress();
	
	void  send();
}
