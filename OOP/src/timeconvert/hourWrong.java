package timeconvert;

public class hourWrong extends Exception{
	public hourWrong() {
		super("Hours value in incorrect format");
	}
	
	public hourWrong(String s) {
		super(s);
	}
}
