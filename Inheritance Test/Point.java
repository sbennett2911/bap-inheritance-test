/***********************************************************************
 Program Name: InheritanceTest.java
 Programmer's Name: Steven Bennett
 Program Description: Program creates 3 classes which inherit from each
 other.
 ***********************************************************************/ 

public class Point {
	
	//declare instance variables
	private double x;
	private double y;
	
	//declare constructors
	public Point()
	{
		setX(0.0);
		setY(0.0);
	}
	
	public Point(double x, double y)
	{
		setX(x);
		setY(y);
	}
	
	//accessor methods
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	//mutator methods
	public void setX(double x)
	{
		this.x = x;
		return;
	}
	
	public void setY(double y)
	{
		this.y = y;
		return;
	}
	
	//toString() method
	public String toString()
	{
		String str = "";
		str = "Point coordinates: " + "(" + x + ", " + y + ")";
		return str;
	}

}
