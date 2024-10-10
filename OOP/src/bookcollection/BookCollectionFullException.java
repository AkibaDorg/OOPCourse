package bookcollection;

public class BookCollectionFullException extends Exception{
	public BookCollectionFullException(String s) {
		super(s);
	}
	public BookCollectionFullException() {
		super("Book collection is full!");
	}
	
}
