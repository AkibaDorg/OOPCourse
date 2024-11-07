package queue;

public class Test {

	public static void main(String[] args) {
		// creates a new queue with 15 as first element
		Queue<Integer> test = new Queue<Integer>(15);
		
		// adds the values to queue
		test.enqueue(14); // 15 <- 14
		test.enqueue(9); // 15 <- 14 <- 9
		
		// should return true
		boolean shouldexist = test.contains(9);
		
		// should return false
		boolean shouldntexist = test.contains(13);
		
		System.out.println(shouldexist + "\n" + shouldntexist);
		
		// removes values one by one
		// four should be null
		Integer one = test.dequeue(); // one is 15. 14 <- 9
		Integer two = test.dequeue(); // two is 14. 9
		Integer three = test.dequeue(); // three is 9. queue is empty.
		Integer four = test.dequeue(); // four is null.
		
		
		// should print 15, 14, 9, null with linebreaks
		System.out.println(one + "\n" + two + "\n" + three + "\n" + four);
	}

}
