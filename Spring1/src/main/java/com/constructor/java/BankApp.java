package com.constructor.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Manager manager = context.getBean(Manager.class);
		manager.callMetting();
		context.close();
	}
}
