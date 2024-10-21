package adtImplement;

public class LinkedList {
	
	
	class Node{
		int x;
		String y;
		Node next;
	}
	
	private Node head;
	private int length;
	
	public LinkedList() {
		this.head = null;
		this.length = 0;
	}
	
	// add to end of list
	private void add(int x, String y) {
		// create new node
		Node anode = new Node();
		anode.x = x;
		anode.y = y;
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
		Node reader = head;
		// start at second node (so technically the first node with actual data)
		int cnt = 1;
		while(cnt < pos) {
			// move through the list
			reader = reader.next;
			cnt++;
		}
		
		return reader;
	}
	
	// add to arbitrary position in list
	private void add(int x, String y, int pos) {
		if(pos > this.length) {
			this.add(x, y);
		}
		Node anode = new Node();
		anode.x = x;
		anode.y = y;
		
		// find node that is BEFORE the current position
		// set new Node next to be node in current position
		// set Node before current position to point to new node
		
		// if the current value to change is the second node (the first actual element)
		if(pos == 1) {
			anode.next = this.head.next;
			this.head.next = anode;
		}
		else {
			// find the node BEFORE the one we actually want to change
			Node ndebefore = this.getNodeAt(pos);
			// position - 1 has been found
			anode.next = ndebefore.next;
			ndebefore.next = anode;
			
		}
		
		length++;
		
		
	}
	
	
	private void remove(int pos) {
		
		// does the first element need to be removed?
		if(pos == 1) {
			this.head.next = this.head.next.next;
		}
		else {
			// get position before removed node
			Node reader = getNodeAt(pos);
			
			// get postion after removed node
			Node newnxt = reader.next.next;
			
			// set previous node's pointer to new next node
			reader.next = newnxt;
		}
		
		length--;
		
	}
	
	private void update(int x, String y, int pos) {
		
		if(pos == 1) {
			this.head.next.x = x;
			this.head.next.y = y;
		}
		else {
			Node changed = this.getNodeAt(pos).next;
			changed.x = x;
			changed.y = y;
		}
		
	}
	
	
	
	
}
