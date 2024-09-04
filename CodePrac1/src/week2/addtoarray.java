package week2;
import java.lang.Math;

// still was working on this
// inserting into arrays isn't really my forte

public class addtoarray {

	// if arr full, return error
	// empty arr good
	// 
	
	// Is it inefficient? yes. but, it's something at the moment
	public static void bubblesort(int arr[], int size) {
		
		boolean hasSwapped = false;
		
		for(int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					hasSwapped = true;
					
				}
				
			}
			
			
			if(!hasSwapped) {
				break;
				
			}
		}
		
		
	}
	
	public static boolean insertArr(int arr[], int num, int size) {
		
		//System.out.println(arr.length);
		
		// array is full, don't continue
		if(arr.length <= size) {
			return false;
		}
		
		
		// puts the num at the end of the current size of the array
		arr[size] = num;
		
		
		bubblesort(arr, size);
		
		
		
		return true;
	}
		
		
		
		
	
	public static void main(String[] args) {
		int arr[] = new int[100];
		int size = 0;
		
		int ranNum = (int)(Math.random()*101);;
		
		for(int i = 0; i < 10; i++) {
			
			while (ranNum == 0) {
				ranNum = (int)(Math.random()*101);
			}
			if(!insertArr(arr, ranNum, size)) {
				System.out.println("ERROR! ARRAY IS FULL");
				break;
			}
			else {
				size++;
			}
		
		} 
		
		for(int x = 0; x < size; x++) {
			System.out.println(arr[x]);
			
		}
		
		
		
	}
	
}
