package graph;

public class Test {

	public static void main(String[] args) {
		Graph cities = new Graph("Test 1");
		
		cities.addNewCity("swawsville");
		
		cities.connect("Test 1", "swawsville", 21.0);

	}

}
