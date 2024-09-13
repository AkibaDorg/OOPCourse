package inheritance;


/**
 * @author Jett Black
 * 
 * 
 * 
 */
public class Faculty extends Person{
	double salary;
	String dept;
	
	public Faculty(double s, String d, String n, String i) {
		super(n, i);
		this.salary = s;
		this.dept = d;
	}
	
	public Faculty(double s, String d) {
		super();
		this.salary = s;
		this.dept = d;
	}
	
	public Faculty() {
		this(0, "Department of Swaws");

	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public void setSalary(double ns) {
		this.salary = ns;
	}
	
	public void setDept(String nd) {
		this.dept = nd;
	}
	
	public String toString() {
		String previous = super.toString();
		return previous + "\n" + this.salary + "\n" + this.dept;
	}
	
}
