package trees;

public class BST {
	class Node{
		int data;
		Node lNode;
		Node rNode;
	}
	
	private Node root;
	
	public BST(int d){
		this.root = new Node();
		this.root.data = d;
		this.root.lNode = null;
		this.root.rNode = null;
	}
	
	public void add(int d) {
		Node newNode = new Node();
		newNode.data = d;
		newNode.rNode = null;
		
		
		Node point = this.root;
		create(newNode, point);
		
		
		
	}
	
	private void create(Node spot, Node point) {
		
		if(point.data > spot.data) {
			if(point.lNode == null) {
				point.lNode = spot;
				return;
			}
			else {
				create(spot, point.lNode);
			}
		}
		else {
			if(point.rNode == null) {
				point.rNode = spot;
				return;
			}
			else {
				create(spot, point.rNode);
			}
		}
		
	}
	public void inOrder() {
		inOrderRecur(this.root);
	}
	
	// writing recursively like this feels cursed
	private void inOrderRecur(Node Root) {
		
		// left
		if(Root.lNode == null) {
			
		}
		else if(Root.lNode.lNode== null && Root.lNode.rNode == null) {
			System.out.println(Root.lNode.data);
		}
		else {
			inOrderRecur(Root.lNode);
		}
		
		//root
		System.out.println(Root.data);
		
		
		// right
		if(Root.rNode == null) {
			
		}
		else if(Root.rNode.lNode== null && Root.rNode.rNode == null) {
			System.out.println(Root.rNode.data);
		}
		else {
			inOrderRecur(Root.rNode);
		}
		
		
		
	}
	
	public int maxima(Node ref) {
		Node point = ref;
		
		while(point.rNode != null) {
			point = point.rNode;
		}
		
		return point.data;
	}
	
	public int maxima() {
		return maxima(this.root);
	}
	
	
	// TODO: work on more. needs to return node
	public Node largestNode(Node ref) {
		
	}
	
	public int minima() {
		Node point = this.root;
		
		while(point.lNode != null) {
			point = point.lNode;
		}
		
		return point.data;
	}
	
	public void remove(int val) {
		Node point = this.root, parent = null;
		while (point != null) {
			if(point.data == val) {
				break;
			}
			else if(point.data > val) {
				parent = point;
				point = point.lNode;
			}
			else {
				parent = point;
				point = point.rNode;
			}
		}
		
		if(point == null) {
			System.out.println("Can't find value");
			return;
		}
		
		if(point.lNode == null || point.rNode == null) {
			if(point == this.root) {
				this.root = this.root.rNode;
				return;
			}
			
			if(parent.lNode == point) {
				parent.lNode = point.rNode;
			}
			else {
				parent.rNode = point.rNode;
			}
		}
		else if(point.rNode == null) {
			if(point == this.root) {
				this.root = this.root.lNode;
				return;
			}
			if(parent.lNode == point) {
				parent.lNode = point.lNode;
			}
			else {
				parent.rNode = point.lNode;
			}
		}
		else {
			Node leftlargest = largestNode(point);
			int largestval = leftlargest.data;
			remove(largestval);
			point.data = largestval;
		}
		
	}

	
	
}
