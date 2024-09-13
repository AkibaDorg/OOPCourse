package archive;

public class Video extends Media{
	int runtimemin;
	
	/**
	 * 
	 * @param i ID of movie
	 * @param t Title of movie
	 * @param r Run time of movie in minutes
	 */
	public Video(String i, String t, int r) {
		super(i, t);
		this.runtimemin = r;
	}
	
	public Video(String i, String t) {
		this(i, t, 1);
	}
	
	public Video() {
		super();
		this.runtimemin = 1;
	}
	
	public int getRunTime() {
		return this.runtimemin;
	}
	
	// if we're already making toString(), and it's always the same format regardless, then we can compare toString() return
	public boolean equals(Video second) {
		if(this.toString().compareTo(second.toString()) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void displayInfo() {
		System.out.println("Title: " + this.title + "\nID: " + this.iden + "\nRun time: " + this.runtimemin);
	}
	
	
	public String toString() {
		String previous = super.toString();
		
		return previous + "\n" + this.runtimemin;
	}
}
