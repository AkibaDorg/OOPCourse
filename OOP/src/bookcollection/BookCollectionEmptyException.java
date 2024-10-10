package bookcollection;

public class BookCollectionEmptyException extends Exception{
	public BookCollectionEmptyException(String s) {
		super(s);
	}
	
	public BookCollectionEmptyException() {
		super("Book collection is empty!");
	}
}
