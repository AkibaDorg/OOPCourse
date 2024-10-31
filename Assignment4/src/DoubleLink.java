
public class DoubleLink<T>{
	class Node{
		T data;
		Node next;
		Node prev;
	}
	
	private Node head;
	private Node tail;
	private int count;
	
	DoubleLink(T d){
		this.head.data = d;
		
		this.head.next = null;
		this.head.prev = null;
		
		this.count = 1;
		
		this.tail = null;
	}
	
	//TODO: add functions
	
	private void add(T d) {
		Node anode = new Node();
		anode.data = d;
		
		// only the head is there
		if(count == 1) {
			// head's next is the new node. new node's next is null, prev is the head, tail variable is finally used to set the new node as last element
			this.head.next = anode;
			anode.next = null;
			anode.prev = this.head;
			this.tail = anode;
		}
		else {
			// set current tail's next to new node; new node's prev to current tail. afterwards set new node as the new tail
			this.tail.next = anode;
			anode.prev = this.tail;
			this.tail = anode;
			anode.next = null;
		}
		
		this.count++;
	}
	
	private void add(int pos, T d) {
		// invalid position given
		if(pos >= this.count || pos <= 0) {
			add(d);
			return;
		}
		
		Node anode = new Node();
		anode.data = d;
		
		Node counter = this.head;
		int count = 1;
		
		
		// increment through the list until we get to the new element
		while(count != pos) {
			counter = counter.next;
			pos++;
		}
		
		// set new node's previous as counter
		anode.prev = counter;
		
		// set new node's next to counter's next
		anode.next = counter.next;
		
		// the next node is equal to the new node
		anode.next.prev = anode;
		
		// set counter's next node to the new node
		counter.next = anode;
		
		
		this.count++;
		
		
	}
	
	private void remove(int pos) {
		// if an invalid position is given, throws this nicely convenient built-in exception
		// thank you java devs, very cool
		try {
			if(pos > this.count || pos <= 0) {
				throw new IndexOutOfBoundsException();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		// clear the last element (the tail)
		if(pos == this.count) {
			this.tail.prev.next = null;
		}
		// clear the first element (the head)
		else if(pos == 1) {
			this.head = this.head.next;
			this.head.prev = null;
		}
		else {
			Node counter = this.head;
			int count = 1;
			
			
			// increment through the list until we get to the new element
			while(count != pos) {
				counter = counter.next;
				pos++;
			}
			
			counter.prev.next = counter.next;
			counter.next.prev = counter.prev;
			
			// is it required? no, but it's a tad verbose
			counter.next = null;
			counter.prev = null;
			
		}
		
		this.count--;
		
		
	}
	
	
	// TODO: work on clear, replace, contains, getLength, and isEmpty
	private void clear() {

		
	}
	
}
