package com.beanlifecycle.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class BankApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = (Employee) context.getBean("Manager");
		employee.doWork();
		context.close();
	}
}
