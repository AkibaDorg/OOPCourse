package adtImplement;

public class ArrFilled extends Exception{
	public ArrFilled() {
		super("Array is too full!");
	}
	public ArrFilled(String s) {
		super(s);
	}
}
