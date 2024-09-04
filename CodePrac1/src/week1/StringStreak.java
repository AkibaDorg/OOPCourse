package week1;
import java.util.Arrays;
import java.util.Scanner;

public class StringStreak {
	public static void main(String[] args) {
		
		String[] words = new String[3];
		
		Scanner input = new Scanner(System.in);
		
		for (int x = 0; x < words.length; x++) {
			System.out.println("Enter a word:");
			String word = input.next();
			
			// lowercase just in case
			word.toLowerCase();
			
			words[x] = word;
			
		}
		input.close();
	
		int shortestword = 0;
		
		// cool thing I learned about
		for(String word : words) {
			
			// ignores first word
			if (Arrays.asList(words).indexOf(word) != 0) {
				if( word.length() < words[shortestword].length()) {
					// gives the index of the new shortest wordd
					shortestword = Arrays.asList(words).indexOf(word);
				}
			}
			
			
		
		}
		
		// debug text. remove later
		//System.out.println("Shortest word: " + words[shortestword]);
		
		// holds the longest streak of text
		String lngststreak = "";
		
		
		/* yeah I don't have the time at the moment
		 * I've been too busy drowning in red tape for a passport
		 * spent way too much time trying to find a solution
		 * basically loop through to each of the words and using compareTo()
		 * with a substring. start from x = 0, and move through up to the shortest word of the array
		 * if that compareTo() doesn't return 0, stop and print the longest streak
		 */
		
		
		
		System.out.println(lngststreak);
		
		
	}
	
	
	
}
