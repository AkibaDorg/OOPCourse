package dictionary;

public class Test {
	public static void main(String[] args) {
		Dictionary phonebook = new Dictionary();
		
		phonebook.addEntry("Momiji", 56709);
		phonebook.addEntry("swaws", 15213);
		phonebook.addEntry("jeff", 512305123);
		phonebook.addEntry("onemore", 312353213);
		
		phonebook.removeEntry("swaws");
	}
}
