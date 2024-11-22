package trees;

public class Test {

	public static void main(String[] args) {
		BST tree = new BST(21);
		tree.add(15);
		tree.add(17);
		tree.add(30);
		tree.add(32);
		tree.add(31);
		
		tree.inOrder();
		
		
		System.out.println("Max value:\t" + tree.maxima());
		System.out.println("Min value:\t" + tree.minima());
		
	}

}
