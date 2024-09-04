package week1;
import java.util.Scanner;
public class ArrSum {

	public static void main(String[] args) {
		
		int[] nums = {5, 7, 9, 11, 15};
		
		Scanner input = new Scanner(System.in);
		
		// takes in user input
		System.out.println("Enter a number:");
		int sum = input.nextInt();
		
		// close input since no longer needed
		input.close();
		
		// int values to store index values
		int add1 = 0, add2 = 0;
		
		boolean foundsum = false;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				// stops from continuing the search if we already found it
				if (!foundsum) {
					// check to prevent using the same number twice
					if (nums[i] != nums[j]) {
						if (nums[i] + nums[j] == sum) {
							add1 = i;
							add2 = j;
							foundsum = true;
							
							
						}
						
					}
				}
				
			}
			
			
		}
		
		
		// if we find two numbers
		if(foundsum) {
			System.out.println("Indecies " + add1 + " and " + add2 + " add to " + sum);
		}
		else {
			System.out.println("No index values found :(");
		}
	
	}
	
}
