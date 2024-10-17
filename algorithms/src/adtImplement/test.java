package adtImplement;

public class test {

	public static void main(String[] args) {
		List test = new List();
		
		for(int x = 0; x <= 5; x++) {
			test.add(x);
		}
		
		test.add(6, 2);
		
		test.Remove(5);
		
		test.Replace(4, 20);
		
		test.Contains(1);
		
		
		System.out.println(test.toString());
	}

}
