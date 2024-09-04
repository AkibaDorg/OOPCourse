package week2;
import java.util.Scanner;

public class inputcheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String word = input.next();
		
		System.out.println("Enter a sentence:");
		String senten = input.nextLine();
		senten = input.nextLine();
		
		input.close();
		
		System.out.println(word + "\n" + senten);
		
		
		boolean hasFound = false;
		
	
		int index = senten.indexOf(word + " ");
		
		
		// checks if word is available at the start of the sentence
		if (index == -1) {
			index = senten.indexOf(" " + word.concat(" "));
		}
		else {
			hasFound = true;
		}
		
		// checks if the word is in the middle
		if (index == -1 && !hasFound) {
			index = senten.indexOf(" " + word);
		}
		else {
			hasFound = true;
			// checks " [word]", which will be skewed off the actual index by one
			index++;
		}
		
		// checks if the word is at the end
		if (index != -1 && !hasFound) {
			hasFound = true;
			// same thing is done here as with line 40
			index++;
		}
		
		// has the word been found?
		if (hasFound) {
			System.out.println("Word was found at index: " + (index));
		}
		else {
			System.out.println("Couldn't find the word in the sentence");
		}
		
	}
}
