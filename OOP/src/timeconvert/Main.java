// This verison of the program allows the user to reenter data if an exception is made

package timeconvert;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int h = 0;
		int m = 1;
		
		boolean isValid = false;
		
		Scanner input = new Scanner(System.in);
		// while loop that allows user input to be reentered 
		while(!isValid) {
			
			
			System.out.println("Insert hour value");
			h = input.nextInt();
			
			System.out.println("Insert Minute value");
			m = input.nextInt();
			
			
			try {
				if(h > 23 || h < 0 ) {
					throw new hourWrong();
				}
				if(m > 59 || m < 0) {
					throw new minuteWrong();
				}
				isValid = !isValid;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		input.close();
		
		boolean isPM = false;
		boolean isMidnight = false;
		
		// this code differentiates 12pm and 12am
		if (h == 0) {
			h = 12;
			isMidnight = !isMidnight;
		}
		if(h >= 12 && !isMidnight) {
			h %= 12;
			isPM = !isPM;
		}
		
		// output text
		if(isPM) {
			System.out.println("The time in 24-format is: " + h + ":" + m + " PM");
			
		}
		else {
			System.out.println("The time in 24-format is: " + h + ":" + m + " AM");
		}

	}
	
}


	
