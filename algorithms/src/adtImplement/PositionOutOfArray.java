package adtImplement;

public class PositionOutOfArray extends Exception{
	public PositionOutOfArray() {
		super("Can't access index value!");
	}
	public PositionOutOfArray(String s) {
		super(s);
	}
}
