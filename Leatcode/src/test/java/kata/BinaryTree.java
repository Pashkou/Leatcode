package kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTree {

	class Node{
		
		Node left;
		Node right;
		int val;
		
		public Node(int val) {
			this.val = val;
		}
		
	}
	
	
	Node root;
	
	public void insert(int val) {
		if(root == null) {
			root = new Node(val);
		}
		
		Node currentNode = root;
		while(true) {
			if(currentNode == null) {
				currentNode = new Node(val);
				return;
			}
			
			if(val < currentNode.val) {
				currentNode = currentNode.left;
			}

			if(val > currentNode.val) {
				currentNode = currentNode.right;
			}
			
		}
		
	}
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
