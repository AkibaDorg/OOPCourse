package shapes;
import java.lang.Math;

public class Triangle implements Shape{
	private double a, b, c;
	
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Triangle() {
		this(1, 1, 1);
	}
	
	public double getArea() {
		double s = (a+b+c)/2;
		double before = s*(s - a)*(s-b)*(s-c);
		return Math.sqrt(before);
	}
	
	public double getPerimeter() {
		return a+b+c;
	}
}
