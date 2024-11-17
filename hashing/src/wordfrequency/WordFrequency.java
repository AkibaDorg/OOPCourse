package wordfrequency;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
public class WordFrequency {
	public static void main(String[] args) {
		
		
		// file handling stuff
		String read = "read.txt";
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(read));
		}
		catch(Exception e) {
			System.out.println("Can't find file.");
			System.exit(0);
		}
		
		// read from the file, set it to lowercase
		read = inputStream.nextLine() + " ";
		read = read.toLowerCase();
		String FileText;
		
		FileText = read;
		// iterater through file until we get to the end
		while(inputStream.hasNextLine()) {
			read = inputStream.nextLine();
			read = read.toLowerCase();
			FileText += read + " ";
		}
		inputStream.close();
		
		
		// removes commonly used punctuation symbols
		FileText = FileText.replaceAll("\\p{Punct}", "");
		
		String[] words = FileText.split(" ");
		
		HashMap<String, Integer> freq = new HashMap<>();
		
		// tally the frequency
		for(String word : words) {
			if(freq.containsKey(word)){
				freq.put(word, freq.get(word) + 1);
			}
			else {
				freq.put(word, 1);
			}
		}
		
		// keySet() is a method that returns a set, hence why I used the Set
		Set<String> keys = freq.keySet();
		
		for (String key : keys){
			System.out.println(key + ": " + freq.get(key));
		}
		
		
	}
}
