package students;

public class Student {
	
	public String name;
	public String ID;
	private double GPA;
	
	// nominal 
	public Student(String n, String i, double g) {
		name = n;
		ID = i;
		GPA = g;
		
	}
	
	// default
	public Student() {
		this("???", "???", 0.0);
		
	}
	
	// get methods
	public String getName() {
		return name;
	}
	
	public String getID() {
		return ID;
	}
	
	public double returnGPA() {
		return GPA;
	}
	
	
	// set methods
	public void editName(String n) {	
		name = n;
	}
	
	public void editID(String i) {	
		ID = i;
	}
	
	public void editGPA(double g) {	
		GPA = g;
	}

}
