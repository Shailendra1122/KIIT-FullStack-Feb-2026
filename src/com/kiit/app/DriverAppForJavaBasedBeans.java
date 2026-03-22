package com.kiit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kiit.config.MyBeans;
import com.kiit.model.Car;
import com.kiit.model.Engine;
import com.kiit.model.Gear;

public class DriverAppForJavaBasedBeans {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyBeans.class);
		
		Engine engine1=(Engine)beanFactory.getBean("en1");
		System.out.println(engine1);
		
		Engine engine2=(Engine)beanFactory.getBean("en2");
		System.out.println(engine2);
		
		Gear gear1=(Gear)beanFactory.getBean("ge1");
		System.out.println(gear1);
		
//		Gear gear2=(Gear)beanFactory.getBean("ge2");
//		System.out.println(gear2);	
		
		Car car1=(Car)beanFactory.getBean("car1");
		car1.startCar();	
	}

}
