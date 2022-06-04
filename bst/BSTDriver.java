package bst;

public class BSTDriver {
	public static void main(String[] args) {
		
		var tree = new Tree();
		
		tree.addNode(5);
		tree.addNode(3);
		tree.addNode(6);
		
		tree.addNode(4);
		tree.addNode(2);

    	System.out.println("Breadth-First Search:");
		tree.breadthFirst(tree.getRoot());
		
    	System.out.println("Pre-Order Search:");
    	tree.preorderTraversal(tree.getRoot());
    	
    	System.out.println("In-Order Search:");
    	tree.inorderTraversal(tree.getRoot());
    	
    	System.out.println("Post-Order Search:");
    	tree.postorderTraversal(tree.getRoot());
	}
}
