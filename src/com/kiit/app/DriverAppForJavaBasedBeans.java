package com.kiit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kiit.config.MyBeans;
import com.kiit.model.Engine;

public class DriverAppForJavaBasedBeans {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyBeans.class);
		
		Engine engine1=(Engine)beanFactory.getBean("getEngineCDI");
		System.out.println(engine1);
		
		
	}

}
