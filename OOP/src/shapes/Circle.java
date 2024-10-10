package shapes;
import java.lang.Math;
public class Circle implements Shape{
	double radius;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public Circle() {
		this(1);
	}
	
	public double getArea() {
		return (Math.PI*this.radius) * (Math.PI*this.radius);
	}
	
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	
}
