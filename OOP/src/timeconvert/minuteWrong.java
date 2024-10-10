package timeconvert;

public class minuteWrong extends Exception{
	public minuteWrong() {
		super("Minutes value in incorrect format");
	}
	
	public minuteWrong(String s) {
		super(s);
	}

}
