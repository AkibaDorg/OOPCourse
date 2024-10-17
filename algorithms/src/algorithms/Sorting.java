package algorithms;

public class Sorting {
	public static void main(String[] args) {
		int a[] = {30, 20, 40, 10, 45, 60, 50};
		
		insertionSort(a);
		
		binarySearch(a, 40);
		
		for(int num : a) {
			System.out.println(num);
		}
		
	}
	
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			
			int temp = arr[i];
			
			int j = i-1;
			
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			
		}
		
	}
	
	public static int binarySearch(int[] arr, int val) {
		/* general gist is as follows
		 * find the middle of the array
		 * if the num we want is less than, set upper bound to mid - 1; more than, lower bound mid + 1
		 */
		
		int mid = arr.length / 2;
		int up = arr.length - 1;
		int low = 0;
		
		if(arr[mid] == val) {
			return mid;
		}
		
		
		
		
		
		return -1;
	}
	
}
