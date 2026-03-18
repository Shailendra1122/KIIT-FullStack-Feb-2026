package day25;

public enum Planet implements SolarSystem
{

	MERCURY(5.0,250.0),
	VENUS(6.0,300.0),
	EARTH(7.0,350.0),
	MARS(8.0,400.0),
	JUPITER(19.0,2500.0),
	SATURN(12.0,2000.0),
	URANUS(9.0,1500.0),
	NEPTUNE(2.0,150.0);
	private double radius;
	private double mass;
	
	private Planet(double radius,double mass)
	{
		this.radius=radius;
		this.mass=mass;
	}

	public double getRadius() {
		return radius;
	}

	public double getMass() {
		return mass;
	}
	
	@Override
	public double calculateGravity()
	{
		return mass/(radius*radius);
	}
}
