package bookcollection;

public class bookCollection {
	private String[] names;
	private int size;
	
	public bookCollection() {
		this.names = new String[10];
		this.size = 0;
	}
	
	public void addBook(String title) {
		try {
			if(this.size >= 10) {
				throw new BookCollectionFullException();
			}
			this.names[this.size] = title;
			this.size++;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void removeBook(String title) {
		try {
			if(this.size <= 0) {
				throw new BookCollectionEmptyException();
			}
			boolean found = false;
			int marked = 0;
			for(int x = 0; x < this.size; x++) {
				if(this.names[x].compareTo(title) == 0){
					marked = x;
					found = !found;
				}
			}
			if (found) {
				this.names[marked] = this.names[this.size - 1];
				this.names[this.size - 1] = "";
				this.size--;
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public int getBooksCount() {
		return this.size;
	}
	
	public void showBooks() {
		System.out.println("List of books in collection\n___________________________");
		for(int x = 0; x < this.size; x++) {
			System.out.println(this.names[x]);
		}
	}
	
}
