package com.kiit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kiit.model.Car;
import com.kiit.model.Engine;
import com.kiit.model.Gear;


@Configuration  
@ComponentScan(basePackages = "com.kiit.model") 
public class MyBeans {

	@Bean(name = "en1")
	public Engine getEngineCDI()
	{
		Engine engine=new Engine(1000, 1, "Petrol", "Toyota");
		return engine;
	}
	
	@Bean(name = "en2")
	public Engine getEngineSDI()
	{
		Engine engine2=new Engine();
		engine2.setEngineCC(2000);
		engine2.setEngineLiter(2);
		engine2.setEngineMfg("Honda");
		engine2.setEngineType("Diesel");
		return engine2;
	}
	
	@Bean(name = "ge1")
	public Gear getGearCDI()
	{
		Gear gear1=new Gear(6,"Tata","Automatic");
		return gear1;
	}
	
	@Bean(name = "ge2")
	public Gear getGearSDI()
	{
		Gear gear2=new Gear();
		gear2.setGearLever(8);
		gear2.setGearMfg("Reliance");
		gear2.setGearType("Manual");
		return gear2;
	}
	
	@Bean(name = "car1")
	public Car getCarSDI()
	{
		Car car2=new Car();
		car2.setCarColor("Black");
		car2.setCarMfg("Mahindra");
		car2.setCarModel("Thar");
		car2.setCarPrice(200.0);
		return car2;
	}
}
