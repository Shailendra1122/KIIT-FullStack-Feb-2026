package com.kiit.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kiit.model.Car;
import com.kiit.model.Engine;
import com.kiit.model.Gear;

public class DriverAppForBeanLifeCycle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/mybeans.xml");
		
		Engine engine1=(Engine)beanFactory.getBean("e1");
		System.out.println(engine1);
		
		engine1=null;
		beanFactory.registerShutdownHook();
		
	}

}
