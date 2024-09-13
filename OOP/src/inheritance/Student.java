package inheritance;


/**
 * @author Jett Black
 * 
 */
public class Student extends Person {
	double GPA;
	String major;
	
	
	public Student(double g, String m, String n, String i) {
		super(n, i);
		this.GPA = g;
		this.major = m;
	}
	
	public Student(double g, String m) {
		super();
		this.GPA = g;
		this.major = m;
	}
	
	public Student() {
		this(3.0, "idk...business?");
	}
	
	public double getGPA() {
		return this.GPA;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public void setMajor(String nm) {
		this.major = nm;
	}
	
	public void setGPA(double ng) {
		this.GPA = ng;
	}
	
	public String toString() {
		
		String previous = super.toString();
		return previous + "\n" + this.GPA + "\n" + this.major;
	}
	
}
