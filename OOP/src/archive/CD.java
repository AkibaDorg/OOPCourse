package archive;
/**
 * CD 
 */
public class CD extends Media{
	String genre;
	String artist;
	
	/**
	 * 
	 * @param n Name of CD
	 * @param i ID number of CD as String
	 * @param g Genre of music
	 * @param a Artist of music
	 */
	public CD(String n, String i, String g, String a) {
		super(i, n);
		this.genre = g;
		this.artist = a;
	}
	
	public CD(String n, String i) {
		this(n, i, "Something you never heard about", "A really underground artist. You wouldn't know them.");
	}
	
	public CD() {
		super();
		this.genre = "Something you never about";
		this.artist = "A really underground artist. You wouldn't know them.";
	}
	
	public String getGenre() {
		return this.genre;
		
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	
	public void displayInfo() {
		System.out.println("Title: " + this.title + "\nArtist: " + this.artist + "\nGenre: " + this.genre + "\nID: " + this.iden);
	}
	
	// if we're already making toString(), and it's always the same format regardless, then we can compare toString() return
	public boolean equals(CD second) {
		if (this.toString().compareTo(second.toString()) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String previous = super.toString();
		return previous + "\n" + this.genre + "\n" + this.artist;
	}
}
