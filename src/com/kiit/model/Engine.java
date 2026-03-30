package com.kiit.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Engine{ //implements InitializingBean,DisposableBean {

	private int engineCC;
	private int engineLiter;
	private String engineType;
	private String engineMfg;
	
	public Engine() {}
	public Engine(int engineCC, int engineLiter, String engineType, String engineMfg) {
		this.engineCC = engineCC;
		this.engineLiter = engineLiter;
		this.engineType = engineType;
		this.engineMfg = engineMfg;
		System.out.println("All Args Constructor of Engine invoked");
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public int getEngineLiter() {
		return engineLiter;
	}
	public void setEngineLiter(int engineLiter) {
		this.engineLiter = engineLiter;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getEngineMfg() {
		return engineMfg;
	}
	public void setEngineMfg(String engineMfg) {
		this.engineMfg = engineMfg;
	}
	@Override
	public String toString() {
		return "Engine [engineCC=" + engineCC + ", engineLiter=" + engineLiter + ", engineType=" + engineType
				+ ", engineMfg=" + engineMfg + "]";
	}
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("Just before destructor");
//		
//	}
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Immediately after constructor");
//		
//	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Desctrucor Invoked");
	}
	
	
	@PreDestroy
	public void goodNight()  {
		System.out.println("Just before destructor");
		
	}
	
	@PostConstruct
	public void goodMorning()  {
		System.out.println("Immediately after constructor");
		
	}
	
	public void startEngine()
	{
		System.out.println("Vroooommmmm!!!");
	}
}
