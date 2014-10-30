/***********************************************************************
 Program Name: InheritanceTest.java
 Programmer's Name: Steven Bennett
 Program Description: Program creates 3 classes which inherit from each
 other.
 ***********************************************************************/ 

public class Cube extends Square {
	
	//declare instance variables
	private double depth;
	
	//constructors
	public Cube()
	{
		setDepth(0.0);
	}
	
	public Cube(double depth)
	{
		setDepth(depth);
	}
	
	//accessor methods
	public double getDepth()
	{
		return depth;
	}
	
	//mutator methods
	public void setDepth(double depth)
	{
		this.depth = depth;
		return;
	}
	
	//toString() method
	public String toString()
	{
		String str = "";
		str = "Cube Depth: " + getDepth() + "\nCube Area: " + area(getDepth()) + 
				"\nCube Volume: " + volume(getDepth()) + "\nPoint Coordinates Cube: " + 
				"(" + getX() + ", " + getY() + ")";
		return str;
	}
	
	//surface area of a cube method
	public double area(double depth)
	{
		return 6 * (depth * depth);
	}
	
	//volume of a cube method
	public double volume(double depth)
	{
		return depth * depth * depth;
	}
}
