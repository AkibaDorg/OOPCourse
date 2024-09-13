package circles;

import java.lang.Math;
/**
 * Circle class creates a circle object with a defined radius and color.
 * @author Jett Black
 * 
 * 
 * 
 * 
 * 
 */
public class Circle {
	// create attributes
	
	// best to leave attributes private
	private double radius;
	private String color;
	
	/**
	 * Nominal constructor that should be preferred
	 * @param r radius of circle in double type
	 * @param s color of circle in string type
	 */
	
	public Circle(double r, String s) {
		radius = r;
		color = s;
	}
	
	
	/**
	 * Default constructor that generates a black unit circle
	 * 
	 */
	public Circle() {
		this(1.0, "Black");
	}
	
	
	// getters
	
	/**
	 * Returns the area of the circle. Defined as pi*r^2
	 * @return void
	 */
	public double getArea() {
		
		return Math.PI*(radius * radius);
		
	}
	
	/**
	 * Returns the circle's color
	 * 
	 * @return String
	 */
	public String getColor() {
		
		return this.color;
	}
	
	/**
	 * Returns the circle's radius
	 * @return double
	 */
	public double getRadius() {
		return this.radius;
		
	}
	
	
	// setters
	
	/**
	 * Changes the radius of circle to a new defined radius.
	 * @param r the new radius of the circle
	 * @return void
	 */
	public void changeRadius(double r) {
		radius = r;
		
	}
	
	
	/**
	 * Merges two circles by combining their radius
	 * 
	 * @param c Circle whose radius will be added with the current circle
	 * 
	 */
	public void merge(Circle c) {
		this.radius += c.getRadius();
		
	}
	
	
}
