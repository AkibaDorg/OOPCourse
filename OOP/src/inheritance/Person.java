package inheritance;

/**
 * Superclass of person
 * @Author Jett Black
 */
public class Person {
	String name;
	String ID;
	
	/**
	 * Nominal constructor for Person object.
	 * @param n name of person
	 * @param i ID of person
	 */
	public Person(String n, String i) {
		this.name = n;
		this.ID = i;
	}
	
	/**
	 * Generic constrctor for Person object
	 * 
	 */
	public Person() {
		this("????","B???????");
	}
	
	/**
	 * 
	 * @return Person's name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * 
	 * @return Person's ID
	 */
	public String getID() {
		return this.ID;
	}
	
	public void setName(String nn) {
		this.name = nn;
	}
	
	public void setID(String ni) {
		this.ID = ni;
	}
	
	/**
	 * @return Person's name and ID with a newline seperating the two.
	 */
	public String toString() {
		return this.name + "\n" + this.ID;
	}
}
