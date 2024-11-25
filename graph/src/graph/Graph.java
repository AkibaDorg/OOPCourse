package graph;
import java.util.ArrayList;
import java.util.Scanner;

public class Graph {

	// entry node for each city connection
	class Entry{
		String title;
		double dist;
	}

	// The ArrayList that holds the ArrayList of entries
	private ArrayList<ArrayList<Entry>> cities;
	
	// constructor
	public Graph(String name) {
		Entry first = new Entry();
		first.title = name;
		first.dist = 0.0;
		
		this.cities = new ArrayList<>();
		
		ArrayList<Entry> distances = new ArrayList<Entry>();
		
		distances.add(first);
		
		this.cities.add(distances);
		
	}
	// default constructor
	public Graph() {
		this("Swaws");
	}
	
	// TODO: fix for-loop
	public void addNewCity(String name) {

		for(ArrayList<Entry> element : this.cities){
			if(element.getFirst().title.equals(name)){
				System.out.println("City already exists in graph!\nPlease enter a new name");
				Scanner input = new Scanner(System.in);
				String newname = input.next();
				input.close();
				addNewCity(newname);
				return;
			}
		}

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
		if(distance <= 0.0){
			System.out.println("Improper distance given!");
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

	public boolean areConnected(String frst, String scnd){
		// we need to simply see if first town name has the second one, no need to check second one really...
		for(ArrayList<Entry> element : this.cities){
			// check if we have the first town
			if(element.getFirst().title.equals(frst)){
				// check if the second town is in the ArrayList of distances
				for(Entry distances : element){
					// check each distance in the array to see if the second town is there
					// given that a town must be in the list to be connected, this will work (for now)
					if(distances.title.equals(scnd)){
						return true;
					}
				}
			}
		}
		// default return
		return false;
	}
	public static void main(String[] args){

		// I'm too lazy to type both of these names several times, so I did this
		String name1, name2;
		name1 = "Manteo";
		name2 = "Kitty Hawk";

		// add Manteo
		Graph cities = new Graph(name1);

		// add Kitty Hawk
		cities.addNewCity(name2);

		// connect Kitty Hawk and Manteo together
		cities.connect(name1, name2, 5.0);

		// tests if names are duplicated
		cities.addNewCity(name1);

		cities.addNewCity("Raleigh");


		// should print "true false" since we connected Manteo and Kitty Hawk, but not Raleigh
		System.out.println(cities.areConnected(name1, name2));
		System.out.println(cities.areConnected(name1, "Raleigh"));


	}
}
