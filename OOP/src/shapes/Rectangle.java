package shapes;

public class Rectangle implements Shape{
	private double length;
	private double width;
	
	
	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}
	
	public Rectangle() {
		this(1,1);
	}
	
	
	public double getArea(){
		return length*width;
	}
	
	public double getPerimeter() {
		
		return (2*length)+(2*width);
	}
	
	
}
