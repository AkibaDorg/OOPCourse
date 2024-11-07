package doubleLink;

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
		this.head = new Node();
		this.head.data = d;
		
		this.head.next = null;
		this.head.prev = null;
		
		this.count = 1;
		
		this.tail = null;
	}
	
	//TODO: add functions
	
	public void add(T d) {
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
	
	public void add(int pos, T d) {
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
			count++;
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
	
	public void remove(int pos) throws IndexOutOfBoundsException{
		// if an invalid position is given, throws this nicely convenient built-in exception
		// thank you java devs, very cool
		// but I could also be very wrong on how I'm implementing this
		// either way, it throws a (hopefully) useful exception on an invalid method call
		if(pos > this.count || pos <= 0) {
			throw new IndexOutOfBoundsException();
		}
		
		
		
		
		// clear the first element (the head) depend if it's the only element or not
		if(pos == 1) {
			
			if(this.count == 1) {
				this.head.data = null;
			}
			else {
				this.head = this.head.next;
				this.head.prev = null;
			}
			
		}
		// clear the last element (the tail)
		else if(pos == this.count && this.count != 1) {
			Node newtail = this.tail.prev;
			this.tail.prev.next = null;
			this.tail = newtail;
		}
		// element is somewhere in the middle
		else {
			Node counter = this.head;
			int count = 1;
			
			
			// increment through the list until we get to the new element
			while(count != pos) {
				counter = counter.next;
				count++;
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
	public void clear() {
		if(this.count == 0) {
			return;
		}
		while(this.count != 0) {
			remove(this.count);
		}
		
	}
	
	public void replace(int pos, T data) throws IndexOutOfBoundsException {
		if(pos > this.count || pos <= 0) {
			throw new IndexOutOfBoundsException();
		}
		
		if(pos == 1) {
			this.head.data = data;
		}
		else if(pos == this.count) {
			this.tail.data = data;
		}
		else {
			Node counter = this.head;
			int count = 1;
			
			
			// increment through the list until we get to the new element
			while(count != pos) {
				counter = counter.next;
				pos++;
			}
			
			counter.data = data;
			
		}
	}
	
	public boolean contains(T data) {
		if(this.count == 0) {
			return false;
		}
		
		// set a reader node to the head
		Node reader = this.head;
		// we keep iterating through the 
		while(reader != null) {
			if(reader.data == data) {
				return true;
			}
			
			reader = reader.next;
		}
		
		return false;
		
	}
	
	public int getLength() {
		return this.count;
	}
	
	public boolean isEmpty() {
		if(this.count == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
