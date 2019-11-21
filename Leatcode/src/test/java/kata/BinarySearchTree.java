package kata;

import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;

public class BinarySearchTree {
	class Node{
		Node left, right;
		Integer val;
		public Node(Integer value) {
			this.val = value;
		}
	}

	Node root;
	
	public Node lookup(Integer value) {
		if(root == null) return null;
		
		if(root.val == value) return root;
		
		Node currentNode = root;
		while(currentNode != null) {
			if(currentNode.val.equals(value)) {return currentNode;}
			
			if(value < currentNode.val) {
				currentNode = currentNode.left;
			}
			if(value > currentNode.val) {
				currentNode = currentNode.right;
			}
			
		}
		return null;
	}
	
	public void insert(Integer newValue) {
		if(root == null) {
			root = new Node(newValue);
			return;
		}
		Node currentNode = root;
		while(true) {
			if(newValue <  currentNode.val) {
				if(currentNode.left == null) {currentNode.left = new Node(newValue); return;}
				else {currentNode = currentNode.left;}
			}
			
			if(newValue >  currentNode.val) {
				if(currentNode.right == null) {currentNode.right = new Node(newValue); return;}
				else {currentNode = currentNode.right;}
			}
		}
	}
	
	public void delete(Integer oldValue) {
		
		if(root.val.equals(oldValue)) {
			root = null; return;
		}
		
		Node currentNode = root;
		Node parentNode = null;
		while(true) {
			if(oldValue < currentNode.val) { 
				parentNode = currentNode; currentNode = currentNode.left; }
			if(oldValue > currentNode.val) { 
				parentNode = currentNode; currentNode = currentNode.right;}
			if(oldValue == currentNode.val) {
				if((currentNode.left != null) && (currentNode.right == null)) {
					if(currentNode.val < parentNode.val) {
						parentNode.left = currentNode.left;
					}else {
						parentNode.right = currentNode.left;
					}
					return;
				} else if((currentNode.right != null) && (currentNode.left == null)) {
					
					if(currentNode.val < parentNode.val) {
						parentNode.left = currentNode.left;
					}else {
						parentNode.right = currentNode.left;
					}
					return;
				} else {

					Node leftMost = currentNode.right;
					while(leftMost.left != null) {
						leftMost = leftMost.left;
					}
					
					currentNode.val = leftMost.val;
					leftMost = null;
					return;
				}
			}
		}
		
		
	}
	

	
	
	
	
	@Test
	public void test() {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(9);
		bst.insert(4);
		bst.insert(20);
		bst.insert(1);
		bst.insert(6);
		bst.insert(15);
		bst.insert(170);
		
		bst.delete(20);
		
		System.out.println(bst.lookup(170).val);

		
	}

}
