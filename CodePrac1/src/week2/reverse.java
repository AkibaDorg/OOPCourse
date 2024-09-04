package week2;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		
		String senten = input.nextLine();
		
		input.close();
		
		// Use StringBuilder to make it easier to reverse
		// source code is at docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html
		StringBuilder text = new StringBuilder();
		
		text.append(senten);
		
		text.reverse();
		
		System.out.println(text);
	}

}
