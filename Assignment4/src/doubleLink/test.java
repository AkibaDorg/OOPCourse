package doubleLink;

public class test {

	// test method for all functions
	// all tests should work as I've checked each one with the debugger
	public static void main(String[] args) {
		DoubleLink<Integer> list = new DoubleLink<Integer>(21);
		
		// tests adding elements
		list.add(18);
		list.add(51);
		list.add(13);
		
		// tests removing
		list.remove(3);
		
		// tests removing element in the middle of the list (i.e. neither the head nor tail)
		try {
			list.remove(10);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		// tests if an element exists in the list
		boolean shouldexist = list.contains(13);
		boolean doesntexist = list.contains(51);
		
		System.out.println(shouldexist);
		System.out.println(doesntexist);
		
		// tests if clear() works as intended
		list.clear();
		if(list.isEmpty()) {
			System.out.println("Link list is empty");
		}
		else {
			System.out.println("Something wrong happened :(");
		}
		
	}

}
