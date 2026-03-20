package com.kiit.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kiit.model.Car;
import com.kiit.model.Engine;
import com.kiit.model.Gear;

public class DriverAppForBeanScope {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/mybeans.xml");
		
		System.out.println("Hi");
		
		Engine customer1=(Engine)beanFactory.getBean("e1");
		System.out.println(customer1);
		
		Engine customer2=(Engine)beanFactory.getBean("e1");
		System.out.println(customer2);
		
		System.out.println(customer1==customer2);	//false
		
		
	}

}
//Aditya "H"