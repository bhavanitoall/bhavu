package com.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationAutowireTestService {
	 
    public static void main(String[] args) {
      
      ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfigForAutowired.class);
        
        AutowireTeatService adits = ctxt.getBean(AutowireTeatService.class);
        adits.test();
       // ...  
    }
}
