package graph;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Graph cities = new Graph("Test 1");
		
		cities.addNewCity("swawsville");
		
		cities.connect("Test 1", "swawsville", 21.0);
		Scanner input = new Scanner(System.in);

		if(!cities.addNewCity("swawsville")){
			boolean isValid = false;
			while(!isValid){
				System.out.println("Please enter a new name");
				isValid = cities.addNewCity(input.next());
			}


		}
		input.close();
	}

}
