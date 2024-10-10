package filewrite;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Filewrite {

	public static void main(String[] args) {
		// assuming you use macos/linux
		String outputfile = "text.txt";
		PrintWriter outputstream = null;
		try {
			outputstream = new PrintWriter(outputfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}

		
		
		outputstream.println("test");
		
		outputstream.close();
	}

}
