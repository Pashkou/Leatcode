package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTree {

	int value;
	BinarySearchTree left;
	BinarySearchTree right;
	
	
	void insert(int newValue){
		if(value == 0) {
			this.value = newValue;
			return;
		}
		

		BinarySearchTree currentNode = this;
		
		while(true) {
			if(newValue <  currentNode.value) {
				if(currentNode.left == null) {
					currentNode.left = new BinarySearchTree();
					currentNode.left.value = newValue;
					return;
				}else {
					currentNode = currentNode.left;
				}
			}
			
			if(newValue >  currentNode.value) {
				if(currentNode.right == null) {
					currentNode.right = new BinarySearchTree();
					currentNode.right.value = newValue;
					return;
				}else {
					currentNode = currentNode.right;
				}
			}
			
			
			
			
		}
		
	}
	
	@Test
	public void test() {
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(9);
		tree.insert(4);
		tree.insert(6);
		tree.insert(1);
		tree.insert(20);
		tree.insert(170);
		tree.insert(15);
		
		System.out.println("");
	}

}
