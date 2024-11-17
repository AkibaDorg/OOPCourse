package dictionary;
import java.util.Scanner;

public class Dictionary {
	private Entry[] Dictionary;
	private final int CAPACITY = 100;
	private int count;
	
	class Entry{
		String name;
		int num;
	}
	
	public Dictionary(String na, int n) {
		this.Dictionary = new Entry[CAPACITY];
		
		Entry first = new Entry();
		
		
		first.name  = na;
		first.num = n;
		
		this.Dictionary[0] = first;
		
		this.count = 1;
		
	}
	
	public Dictionary() {
		this("John Doe", 8675309);
	}
	
	public boolean addEntry(String na, int n) {
		if(this.count >= CAPACITY) {
			return false;
		}
		
		// dupe is found
		if(findEntry(na) != -1) {
			System.out.println("Name already exists!\nPlease enter a new name.");
			Scanner input = new Scanner(System.in);
			String name = input.nextLine();
			input.close();
			addEntry(name, n);
		}
		
		Entry create = new Entry();
		create.name = na;
		create.num = n;
		
		if(count == 0) {
			this.Dictionary[0] = create;
		}
		else {
			this.Dictionary[this.count - 1] = create;
		}
		count++;

		return true;
	}
	
	private int findEntry(String na) {
		for(int x = 0; x < this.count - 1; x++) {
			if(this.Dictionary[x].name.equals(na)) {
				return x;
			}
		}
		
		return -1;
	}
	
	public int getNum(String na) {
		int index = findEntry(na);
		
		if(index == -1) {
			return -1;
		}
		
		return this.Dictionary[index].num;
	}
	
	public int getSize() {
		return this.count;
	}
	
	public boolean isEmpty() {
		if(this.count != 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean removeEntry(String na) {
		int index = findEntry(na);
		if(index == -1) {
			return false;
		}
		
		for(int x = index; x < this.count; x++) {
			this.Dictionary[x] = this.Dictionary[x+1];
		}
		
		
		return true;
	}
	
	public void clear() {
		for(Entry idx : this.Dictionary) {
			idx.name = null;
			idx.num = 0;
		}
		this.count = 0;
	}
	
	
}
