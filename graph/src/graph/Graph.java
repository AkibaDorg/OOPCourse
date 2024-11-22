package graph;
import java.util.ArrayList;

// TODO: something is weird with entry arraylist, where it has a nested arraylist in itself?
public class Graph {
	
	class Entry{
		String title;
		double dist;
	}
	
	private ArrayList<ArrayList<Entry>> cities;
	
	
	public Graph(String name) {
		Entry first = new Entry();
		first.title = name;
		first.dist = 0.0;
		
		this.cities = new ArrayList<>();
		
		ArrayList<Entry> distances = new ArrayList<Entry>();
		
		distances.add(first);
		
		this.cities.add(distances);
		
	}
	
	public Graph() {
		this("Swaws");
	}
	
	
	public void addNewCity(String name) {
		// create new city
		Entry create = new Entry();
		create.title = name;
		create.dist = 0.0;
		
		// create list to hold city and add city to list
		ArrayList<Entry> distances = new ArrayList<Entry>();
		distances.add(create);
		
		// add list to overall list
		this.cities.add(distances);
		
	}
	
	public void connect(String frst, String scnd, double distance) {		
		if(frst.equals(scnd)) {
			System.out.println("Both cities' names are the same!");
			return;
		}
		Entry ent1 = new Entry(), ent2 = new Entry();
		
		ent1.title = frst;
		ent1.dist = distance;
		
		ent2.title = scnd;
		ent2.dist = distance;
		
		// we do this in a single run
		// check if the current element in the overall array is equal the first or second city
		// if it does, we add the other one
		for(ArrayList<Entry> element : this.cities) {
			// check first city
			if(element.getFirst().title.equals(frst)) {
				element.add(ent2);
			}
			// check second city
			else if(element.getFirst().title.equals(scnd)) {
				element.add(ent1);
			}
		}
		
		
	}
}
