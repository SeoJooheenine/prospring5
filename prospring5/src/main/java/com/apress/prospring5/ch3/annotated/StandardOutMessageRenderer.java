package com.apress.prospring5.ch3.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apress.prospring5.ch2.decoupled.MessageProvider;
import com.apress.prospring5.ch2.decoupled.MessageRenderer;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer{

	private MessageProvider messaageProvider;

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Autowired
	public void setMessageProvider(MessageProvider provider) {
		this.messaageProvider = provider;
		
	}

	@Override
	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
