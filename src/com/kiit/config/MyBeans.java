package com.kiit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kiit.model.Engine;


@Configuration  
public class MyBeans {

	@Bean //(name = "en1")
	public Engine getEngineCDI()
	{
		Engine engine=new Engine(1000, 1, "Petrol", "Toyota");
		return engine;
	}
}
