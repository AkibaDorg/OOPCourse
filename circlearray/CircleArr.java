package circlearray;
import java.util.ArrayList;

public class CircleArr {
	ArrayList<Circle> list = new ArrayList<Circle>();
	
	public CircleArr(double r, String s) {
		Circle first = new Circle(r, s);
		this.list.add(first);
		
	}
	
	public CircleArr() {
		this(0.0, "black");
	}
	
	
	public void addCircle(double r, String s) {
		Circle add = new Circle(r, s);
		this.list.add(add);
	}
	
	public void removeCircle(int pos) {
		// TODO: properly show NoCircleFound
		// remove() already has an IndexOutOfBoundsException
		try {
			this.list.remove(pos);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String displayColor() {
		String list = "";
		for(Circle ele : this.list) {
			list += ele.getColor() + "\n";
		}
		return list;
	}
	
	public double totalArea() {
		Circle total = new Circle(0.0, "purple");
		for(Circle ele : this.list) {
			total.merge(ele);
		}
		
		return total.getRadius();
	}
	
	public String toString() {
		String list = "";
		for(int x = 0; x < this.list.size(); x++) {
			Circle hold = this.list.get(x);
			list += "Circle " + (x + 1) + ": " + hold.getColor() + " " + hold.getArea() + "\n";
		}
		
		return list;
	}
	
}
