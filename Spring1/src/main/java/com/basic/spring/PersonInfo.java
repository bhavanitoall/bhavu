package com.basic.spring;




import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class PersonInfo {

	public static void main(String[]args) {
		
		
		Resource res = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		
		WelcomeBean wb = (WelcomeBean)factory.getBean("id1");
		
		wb.show();
	}
}
