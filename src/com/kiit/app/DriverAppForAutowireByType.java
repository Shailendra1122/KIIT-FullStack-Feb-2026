package com.kiit.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kiit.model.Car;
import com.kiit.model.Engine;
import com.kiit.model.Gear;

public class DriverAppForAutowireByType {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/mybeans.xml");
		
		Car car1=(Car)beanFactory.getBean("c1");
		System.out.println(car1);	
	}

}
