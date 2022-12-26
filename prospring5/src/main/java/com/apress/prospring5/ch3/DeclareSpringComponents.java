package com.apress.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;

public class DeclareSpringComponents {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml.xml");
		ctx.refresh();
		MessageRenderer messageRenerer = ctx.getBean("renderer",MessageRenderer.class);
		messageRenerer.render();
		ctx.close();
	}

}
