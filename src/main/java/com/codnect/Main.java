package com.codnect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		
		Person person1 = context.getBean("person1", Person.class);
		Person person2 = context.getBean("person2", Person.class);
		
		
		System.out.println("person 1 : " + person1);
		System.out.println("person 2 : " + person2);
		
	}

}
