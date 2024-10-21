package adtImplement;

public class LinkedList {
	
	
	class Node{
		int x;
		Node next;
	}
	
	private Node head;
	private int length;
	
	public LinkedList(int x) {
		this.head.x = x;
		this.head.next = null;
		this.length = 1;
	}
	
	// add to end of list
	private void add(int x) {
		// create new node
		Node anode = new Node();
		anode.x = x;
		anode.next = null;
		
	
		// is header's next node is empty? that is, is the list empty?
		if(this.head.next == null) {
			this.head.next = anode;
		}
		// if it isn't, we find the node whose next is null
		else {
			// find last node, and set next to new node
			Node reader = head;
			// keeps moving from nodes until some node's next node reference is null
			while(reader.next != null) {
				reader = reader.next;
			}
			
			// set the reader's next node value to the new node
			reader.next = anode;
			
		}
		this.length++;
		
	}
	
	
	private Node getNodeAt(int pos) {
		if(pos == 1) {
			return this.head;
		}
		if(pos > this.length || pos <= 0) {
			return null;
		}
		Node reader = this.head;
		// start at second node (so the one after the head)
		int cnt = 2;
		while(cnt < pos) {
			// move through the list
			reader = reader.next;
			cnt++;
		}
		
		return reader;
	}
	
	// add to arbitrary position in list
	private void add(int x, String y, int pos) {
		if(pos > this.length || pos <= 0) {
			this.add(x);
		}
		Node anode = new Node();
		anode.x = x;

		// find node that is BEFORE the current position
		// set new Node next to be node in current position
		// set Node before current position to point to new node
		
		// if the current value to change is the second node (the first actual element)
		if(pos == 1) {
			anode.next = this.head;
			this.head = anode;
		}
		else {
			// find the node BEFORE the one we actually want to change
			Node ndebefore = this.getNodeAt(pos - 1);
			// position - 1 has been found
			anode.next = ndebefore.next;
			ndebefore.next = anode;
			
		}
		
		length++;
		
		
	}
	
	
	private void remove(int pos) {
		if(pos > this.length || pos <= 0) {
			return;
		}
		// does the first element need to be removed?
		if(pos == 1) {
			Node temp = this.head.next;
			Node next = temp.next;
			this.head = temp;
			this.head.next = next;
		}
		else {
			// get position before removed node
			Node reader = getNodeAt(pos - 1);
			
			// get postion after removed node
			Node newnxt = reader.next.next;
			
			// set previous node's pointer to new next node
			reader.next = newnxt;
		}
		
		length--;
		
	}
	
	private void update(int x, int pos) {
		// if pos is invalid, do nothing
		if(pos > this.length || pos <= 0) {
			return;
		}
		
		// is position requested is 1, just work directly on the head
		if(pos == 1) {
			this.head.x = x;
		}
		// get the node after 
		else {
			Node changed = this.getNodeAt(pos).next;
			changed.x = x;
		}
		
	}
	
}
