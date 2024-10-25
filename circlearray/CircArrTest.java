package circlearray;
import java.lang.Math;
public class CircArrTest {

	public static void main(String[] args) {
		String[] colors = {"blue", "black", "red", "yellow", "purple", "white"};
		CircleArr test = new CircleArr(4.0, "purple");
		
		for(int i = 0; i < 20; i++) {
			test.addCircle(Math.random()*10, colors[(int)(Math.random()*colors.length)]);
		}
		
		System.out.println("Showing all circles...");
		System.out.println(test.toString() + "\n\n");
		
		System.out.println("Deleting a random circle...");
		
		int rng = (int)(Math.random()*21);
		
		System.out.println("Deleting circle number " + rng + "\n\n");
		
		test.removeCircle(rng);
		
		System.out.println(test.toString());
		

	}

}
