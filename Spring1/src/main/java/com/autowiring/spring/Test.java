package com.autowiring.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {  
	public static void main(String[] args) {  
	    ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");  
	    A a=context.getBean("a",A.class);  
	    a.display();  
	}  
	}  

