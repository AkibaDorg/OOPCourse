package shapes;

public class Main {

	public static void main(String[] args) {
		int arrsize = 20;
		Shape all[] = new Shape[arrsize];
		
		for(int x = 0; x < arrsize; x++) {
			int ranshape = (int)Math.random()*4;
			switch(ranshape) {
				case 0:
					all[x] = new Rectangle(Math.random()*11, Math.random()*11);
					break;
				case 1:
					all[x] = new Circle(Math.random()*11);
					break;
				case 2:
					all[x] = new Triangle(Math.random()*11, Math.random()*11, Math.random()*11);
					break;
				default:
					all[x] = new Circle(Math.random()*11);
			}
		}
		
		double totalpermi = 0;
		double totalarea = 0;
		
		for(Shape item : all) {
			totalarea += item.getArea();
			totalpermi += item.getPerimeter();
		}
		
		System.out.println("Total area of all shapes: " + totalarea + "\nTotal perimeter: " + totalpermi);
		
	}

}
