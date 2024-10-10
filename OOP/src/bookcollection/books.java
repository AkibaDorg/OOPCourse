package bookcollection;

public class books {

	public static void main(String[] args) {
		bookCollection collection = new bookCollection();
		// Testing to remove book for empty array
		collection.removeBook("Test!");
		
		
		// Testing to add book to full array
		collection.addBook("Neuromancer");
		collection.addBook("Grimoire Weiss");
		collection.addBook("Dialect of Englightenment");
		collection.addBook("Journey to the West");
		collection.addBook("Beyond Good and Evil");
		collection.addBook("Short Story Long");
		collection.addBook("Verteidigung der Woelfe gegen die Laemmer");
		collection.addBook("Why you shouldn't learn JS: A Story of Regret");
		collection.addBook("Necronomicon");
		collection.addBook("Existentialism Is a Humanism");
		collection.addBook("Totally a real book and not me blanking on book titles"); // exception should be caught here
		
		
		collection.showBooks();
		
		System.out.println("Total books in collection: " + collection.getBooksCount());
		

	}

}
