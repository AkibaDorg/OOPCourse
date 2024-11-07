package expressionCheck;
import java.util.Scanner;
public class ExpressionChecker {

	public static void main(String[] args) {
		System.out.println("Write an arithmetic equation. You can use parentheses, brackets, or braces.");
		
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		input.close();
		
		Stack<String> list = new Stack<String>(null);
		
		boolean matches = true;
		
		// this code is very hedious, and I must apologize for it
		for(int x = 0; x < text.length(); x++) {
			String c = String.valueOf(text.charAt(x));
			// see if the current character is an open delimiter
			if(c.equals("(") || c.equals("{") || c.equals("[")) {
				list.push(c);
			}
			// this entire thing checks if the current char complements the current top opening delimiter
			else if(c.equals(")") || c.equals("}") || c.equals("]")) {
				String check = list.peek();
				
				// we use try in the event that there's an extra closing delimiter, else we'd be checking the delimiter with null
				try {
					// use switch to check each corresponding delimiter. ( has to match with ); [ with ]; { with }
					// otherwise we set a boolean value to false
					switch(check) {
					case "(":
						if(c.equals(")")) {
							list.pop();
						}
						else {
							matches = !matches;
						}
						break;
					case "{":
						if(c.equals("}")) {
							list.pop();
						}
						else {
							matches = !matches;
						}
						break;
					case "[":
						if(c.equals("]")) {
							list.pop();
						}
						else {
							matches = !matches;
						}
						break;
					default:
						matches = !matches;
						break;
				}	
				}
				catch(Exception e) {
					matches = !matches;
				}
				
				
		}

		}
		
		if(matches && list.isEmpty()) {
			System.out.println("Equation is balanced");
		}
		else {
			System.out.println("Equation is not balanced");
		}
		
		
	}


}

