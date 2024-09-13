package circles;


public class CircleDemo {

	public static void main(String[] args ) {
		
		Circle[] set = new Circle[100];
		
		String[] colors = {"Blue", "Black", "Red", "Yellow", "Purple", "White"};
		int[] coloramnt = {0, 0, 0, 0, 0, 0};
		
		// generate 100 cirlces of random sizes and colors
		for(int x = 0; x < 100; x++) {
			
			set[x] = new Circle(Math.random()*101, colors[(int)(Math.random()*colors.length)]);
			
		}
		
		
		// calculates total area of all circles in set by adding area
		double totalarea = 0.0;
	
		// loop adds sum of all circles and tallies each color
		for (Circle circle : set) {
			totalarea += circle.getArea();
			switch(circle.getColor()){
			case "Blue":
				coloramnt[0]++;
				break;
			case "Black":
				coloramnt[1]++;
				break;
			case "Red":
				coloramnt[2]++;
				break;
			case "Yellow":
				coloramnt[3]++;
				break;
			case "Purple":
				coloramnt[4]++;
				break;
			case "White":
				coloramnt[5]++;
				break;
				
			}
		}
		
		int largestnumspot = 0;
		
		for(int y = 1; y < coloramnt.length; y++) {
			if(coloramnt[y] > coloramnt[largestnumspot]) {
				largestnumspot = y;
			}
			
			
		}
		
		System.out.println("The area of all circles is: " + totalarea);
		
		System.out.println("The most common color is: " + colors[largestnumspot]);
		
		
		
	}
}