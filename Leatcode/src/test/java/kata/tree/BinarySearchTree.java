package kata.tree;

import java.util.NoSuchElementException;

public class BinarySearchTree {

	private TreeNode root;
	private int size;
	
	public int size() {
		return size;
	};

	
	/*We must first find the correct place to insert the node.
	Start traversing the BST from root.
	Compare root.value with the value passed to the method, the value X.
	If root.value is greater than X, go to the left sub tree.
	If root.value is less than X, go to the right sub tree.
	If we reach a null value, we have found the correct place to insert a new node.*/
	public TreeNode insert(int value) {
		if(root == null) {
			root = new TreeNode(value);
			size = 1;
			return root;
		}else {
			return insertRecursive(root, value);
		}
	};
	
	private TreeNode insertRecursive(TreeNode node, int value) {
		if(node == null) {
			node = new TreeNode(value);
			size++;
			return node;
		}
		
		if(value < node.val) {
			node.left = insertRecursive(node.left, value);
		}else {
			node.right =  insertRecursive(node.right, value);
		}
		return node;
	}
	
	
	public boolean find(int value) {
		if(root == null) {
			return false;
		}else {
			return findRecursively(root, value);
		}
	};
	
	private boolean findRecursively(TreeNode node, int val) {
		if(node == null) {
			return false;
		}else if(node.val == val) {
			return true;
		}else 
		
		if(val < node.val) {
			return findRecursively(node.left, val);
		}else {
			return findRecursively(node.right, val);
		}
	}
	
	public void delete(Integer value) throws NoSuchElementException {
		
	}
	
}
