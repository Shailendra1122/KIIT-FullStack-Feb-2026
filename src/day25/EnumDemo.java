package day25;

import java.util.Scanner;

public class EnumDemo {
public static void main(String[] args) {
	
	
//	Direction myDirection=Direction.SOUTH;
//	
//	System.out.println("I am haeading towards "+myDirection);
//	
//	Weekday today=Weekday.TUESDAY;
//	
//	System.out.println("Today is "+today);
	
	
//	SolarSystem planet;
	Planet planet;
	planet=Planet.JUPITER;
	
	System.out.println("RADIUS OF "+planet + " is "+ planet.getRadius());
	System.out.println("GRAVITY OF "+planet + " is "+ planet.calculateGravity());
	
	MyErrors error=null;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Username ");
	String username=sc.next();
	
	if(username.length()<3)
	{
		error=MyErrors.ERR1;
		System.out.println(String.format(error.getErrorMessage(), username));
		return;
	}
	
	System.out.println("Enter Password ");
	String password=sc.next();
	if(password.length()<8)
	{
		error=MyErrors.ERR2;
		System.out.println(error.getErrorMessage());
	}
}
}

//KT is a Invalid Username