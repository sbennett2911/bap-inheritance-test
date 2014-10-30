/***********************************************************************
 Program Name: InheritanceTest.java
 Programmer's Name: Steven Bennett
 Program Description: Program creates 3 classes which inherit from each
 other.
 ***********************************************************************/ 

public class Square extends Point{
	
	//declare instance variables
	private double sideLength;
	
	//constructors
	public Square()
	{
		setSideLength(0.0);
	}
	
	public Square(double sideLength)
	{
		setSideLength(sideLength);
	}
	
	//accessor methods
	public double getSideLength()
	{
		return sideLength;
	}
	
	//mutator methods
	public void setSideLength(double sideLength)
	{
		this.sideLength = sideLength;
	}
	
	//toString() method
	public String toString()
	{
		String str = "";
		str = "Square side Length: " + getSideLength() + "\nSquare Area: " + area(getSideLength()) + 
				"\nSquare Perimeter: " + perimeter(getSideLength()) + "\nPoint Coordinates Square: " +
				"(" + getX() + ", " + getY() + ")";
		return str;
	}
	
	//area() method
	public double area(double sideLength)
	{
		return sideLength * sideLength;
	}
	
	//perimeter() method
	public double perimeter(double sideLength)
	{
		return sideLength * 4;
	}
}
