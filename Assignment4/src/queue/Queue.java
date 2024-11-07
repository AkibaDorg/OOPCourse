package queue;

public class Queue<T>{
	class Node{
		T data;
		Node next;
	}
	
	private Node head;
	
	Queue(T d){
		this.head = new Node();
		this.head.data = d;
	}
	
	public void enqueue(T d) {
		if(this.head.data == null) {
			this.head.data = d;
		}
		else {
			Node next = new Node();
			next.data = d;
			
			Node reader = this.head;
			
			while(reader.next != null) {
				reader = reader.next;
			}
			
			reader.next = next;
			
		}
	}
	
	public T dequeue() {
		if(this.isEmpty()) {
			return null;
		}
		
		T hold = this.head.data;
		
		// is there only one element left?
		if(this.head.next == null) {
			this.head.data = null;
		}
		else {
			this.head = this.head.next;
		}
		
		return hold;
	}
	
	// very simple one line code that returns true or false based on if head's next is a valid entry or not
	public boolean isEmpty() {
		return (this.head.data == null) ? true : false;
	}
	
	public boolean contains(T d) {
		Node reader = this.head;
		while(reader != null) {
			if(reader.data.equals(d)) {
				return true;
			}
			reader = reader.next;
		}
		
		return false;
	}
	
	
}
