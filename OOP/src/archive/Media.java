package archive;

public class Media {
	String iden;
	String title;
	
	
	public Media(String i, String t){
		this.iden = i;
		this.title = t;
	}
	
	public Media() {
		this("0000000", "Lost piece of the Library of Alexandria");
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getIden() {
		return this.iden;
	}
	
	public String toString() {
		return this.iden + "\n" + this.title;
	}
}
