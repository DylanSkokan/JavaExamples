package bst;

import java.util.ArrayList;

public class Tree {
	//The root of the tree. Need to have one as a starting point, we do not have
	//parents so we would start searches at root and go down
	private Node root;
	
	//when we first create the tree, we can set the root to null
	public Tree(){
		root = null;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	
	public Node getRoot() {
		return this.root;
	}
	
    //Adds a node to the BST. We need a separate addNode function from addRecursive because we
	//need to save the root in the data member but we dont want to return anything to the driver.
    void addNode(int value)  { 
        root = addRecursive(root, value); 
    } 
   
    Node addRecursive(Node currNode, int value) {
        //If the we reach a null node, create a node with value
    	//and set the null node as the new node
        if (currNode == null) { 
            currNode = new Node(value); 
            return currNode; 
        } 
        
        //If it is not null, we need to find the correct spot for the new node.
        
        //if the value is less than the current nodes value, go left
        if (value < currNode.getValue()) {
        	currNode.setLeft(addRecursive(currNode.getLeft(), value)); 
        }
        
        //if the value is greater than the current nodes value, go right
        else if (value > currNode.getValue()) {
        	currNode.setRight(addRecursive(currNode.getRight(), value)); 
        }
            
        //the tree after the above is finished
        return currNode; 
    }
    
    void removeNode(int valueToRemove)  { 
        root = removeRecursive(root, valueToRemove); 
    } 
    
    Node removeRecursive(Node currNode, int valueToRemove) {
    	if(currNode.getLeft() != null){
        	if(currNode.getLeft().getValue() == valueToRemove) {
        		currNode.setLeft(null);
        		return currNode;
        	} 
    		
    		removeRecursive(currNode.getLeft(), valueToRemove);
    	}
    	if(currNode.getRight() != null){
        	if (currNode.getRight().getValue() == valueToRemove) {
        		currNode.setRight(null);
        		return currNode;
        	}
    		
    		removeRecursive(currNode.getRight(), valueToRemove);
    	}
    	
    	return currNode;
    }
    
    //Preorder Traversal (root, left, right)
    void preorderTraversal(Node currNode) {
    	System.out.println(currNode.getValue());
    	if(currNode.getLeft() != null){
    		preorderTraversal(currNode.getLeft());
    	}
    	if(currNode.getRight() != null){
    		preorderTraversal(currNode.getRight());
    	}
    }
    
    //Inorder Traversal (left, root, right)
    void inorderTraversal(Node currNode) {
    	if(currNode.getLeft() != null){
    		inorderTraversal(currNode.getLeft());
    	}
    	System.out.println(currNode.getValue());
    	if(currNode.getRight() != null){
    		inorderTraversal(currNode.getRight());
    	}
    }
   
    //Postorder Traversal (left, right, root)
    void postorderTraversal(Node currNode) {
    	if(currNode.getLeft() != null){
    		postorderTraversal(currNode.getLeft());
    	}
    	if(currNode.getRight() != null){
    		postorderTraversal(currNode.getRight());
    	}
    	System.out.println(currNode.getValue());
    }
    
    //Breadthfirst
    void breadthFirst(Node root) {
    	var nodes = new ArrayList<Node>();
    	
    	//add root to queue
    	nodes.add(root);
    	
    	//while queue is not empty
    	while(!nodes.isEmpty()) {
    		
    		//get the first node and print it
    		Node tempNode = nodes.get(0);
    		nodes.remove(0);
    		System.out.println(tempNode.getValue());
    		
    		//add children to nodes
    		if(tempNode.getLeft() != null) {
    			nodes.add(tempNode.getLeft());
    		}
    		if(tempNode.getRight() != null) {
    			nodes.add(tempNode.getRight());
    		}
    	}
    }
}
