/* Program that finds the two largest elements
 * of an array. This done via two passes with two
 * different functions, which are found at lines 41
 * and 66 respectively.
 */

package week1;
import java.util.Scanner;
public class LargeIntTest {
	
	public static void main(String[] args) {
		// size of array
		final int SIZE = 10;
		
		Scanner input = new Scanner(System.in);
		int[] nums = new int[SIZE];
		
		// gather user input
		for (int x = 0; x < SIZE; x++){
			System.out.println("Insert a number");
			int num = input.nextInt();
			nums[x] = num;
		}
		
		//close input since it's no longer needed
		input.close();
		
		/* assign two integers that are equal to the return
		* of largestnum() and scndlargnum()
		*/
		int highestnum = largestnum(nums, SIZE);
		
		int scndlargsum = scndlargnum(nums, SIZE, highestnum);
		
		
		System.out.println("The highest number is: " + highestnum + "\nThe second highest is: " + scndlargsum);
		
}
	
	
	/* function that searches for largest element of the array
	 * takes in the array, and the size of the array
	 * returns the largest number of the array
	 */
	public static int largestnum(int arr[], int SIZE) {
		
		// assume largest element is 1
		int lrg = 1;
		
		// compare numbers
				for (int x = 0; x < SIZE; x++){
					// is the current element greater than highest current integer?
					if (arr[x] > lrg) {
						lrg = arr[x];
					}
					
				}
		
		
		return lrg;
	}
	
	
	/* function that searches for the second largest element of the array
	 * takes in the array, the size of the array, and the largest number
	 * largest number is taken in to act as a reference to prevent it also being
	 * the second largest
	 */
	public static int scndlargnum(int arr[], int SIZE, int lrg) {
		
		// assume second largest is 0
		int sln = 0;
		
		for (int x = 0; x < SIZE; x++){
			// is the current element greater than second highest current integer?
			if ((arr[x] > sln) & (arr[x] != lrg)) {
				sln = arr[x];
			}
		}
		
		return sln;
	}
}