/***********************************************************************
 Program Name: InheritanceTest.java
 Programmer's Name: Steven Bennett
 Program Description: Program creates 3 classes which inherit from each
 other.
 ***********************************************************************/ 

import javax.swing.JOptionPane;


public class InheritanceTest {

	public static void main(String[] args) {
		
		//instantiate 3 objects one from each class
		Point pt = new Point(0,0);
		Square sq = new Square(0.0);
		Cube cb = new Cube(0.0);
		
		//get input for Point object
		pt.setX(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value for X (Point Object): ")));
		pt.setY(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value for Y (Point Object): ")));
		
		//get input for Square object
		sq.setX(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value for X (Square Object): ")));
		sq.setY(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value for Y (Square Object): ")));
		sq.setSideLength((Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value for side of square (Square Object): "))));
		
		//get input for Cube object
		cb.setX(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value for X (Cube Object): ")));
		cb.setY(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value for Y (Cube Object): ")));
		cb.setDepth(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter depth of cube (Cube Object): ")));
		
		//show output for 3 objects
		System.out.println("\nOutput from Point object");
		System.out.println(pt.toString());
		System.out.println("\nOutput from Square object");
		System.out.println(sq.toString());
		System.out.println("\nOutput from Cube object");
		System.out.println(cb.toString());
		
		System.exit(0);
	}

}
