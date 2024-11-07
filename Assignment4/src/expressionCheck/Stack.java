package expressionCheck;

public class Stack<T>{
	class Node{
		T data;
		Node next;
	}

	private Node head;
	
	Stack(T d){
		this.head = new Node();
		this.head.data = d;
	}
	
	public void push(T d) {
		if(this.head.data == null) {
			this.head.data = d;
		}
		else {
			Node next =  new Node();
			next.data = d;
			
			next.next = this.head;
			
			this.head = next;
		}
	}
	
	public T pop() {
		if(isEmpty()) {
			return null;
		}
		
		T hold = this.head.data;
		
		// is there only one element?
		if(this.head.next != null) {
			this.head = this.head.next;
		}
		else {
			this.head.data = null;
		}
		
		return hold;
	}
	
	public T peek() {
		return this.head.data;
	}
	
	public boolean isEmpty() {
		return (this.head.data == null) ? true : false;
	}
	
	public void clear() {
		while(this.head.data != null) {
			pop();
		}
	}

}
