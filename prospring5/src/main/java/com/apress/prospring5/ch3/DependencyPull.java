package com.apress.prospring5.ch3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;

public class DependencyPull {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
		MessageRenderer mr = ctx.getBean("renderer",MessageRenderer.class);
		mr.render();
	}

}
