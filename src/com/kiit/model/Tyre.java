package com.kiit.model;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
											//using default constructor 
	private String tyreMfg;					//null
	private double typeDiameter;			//0.0
	private double tyrePrice;				//0.0
	
	public Tyre() {}
	public Tyre(String tyreMfg, double typeDiameter, double tyrePrice) {
		super();
		this.tyreMfg = tyreMfg;
		this.typeDiameter = typeDiameter;
		this.tyrePrice = tyrePrice;
	}
	public String getTyreMfg() {
		return tyreMfg;
	}
	public void setTyreMfg(String tyreMfg) {
		this.tyreMfg = tyreMfg;
	}
	public double getTypeDiameter() {
		return typeDiameter;
	}
	public void setTypeDiameter(double typeDiameter) {
		this.typeDiameter = typeDiameter;
	}
	public double getTyrePrice() {
		return tyrePrice;
	}
	public void setTyrePrice(double tyrePrice) {
		this.tyrePrice = tyrePrice;
	}
	@Override
	public String toString() {
		return "Tyre [tyreMfg=" + tyreMfg + ", typeDiameter=" + typeDiameter + ", tyrePrice=" + tyrePrice + "]";
	}
	
	public void tyreRolling()
	{
		System.out.println("Tyre Rolling...");
	}
	

}
