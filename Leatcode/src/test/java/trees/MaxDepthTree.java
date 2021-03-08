package trees;

import static org.junit.Assert.*;

import org.junit.Test;

import trees.ValidateTreeTest.TreeNode;

public class MaxDepthTree {

	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	public int maxDepth(TreeNode root) {
		if (root == null) return 0;
		if((root.left == null) && (root.right == null)) return 1;
		
		int left = 0;
		if(root.left != null){ 
			left = maxDepth(root.left);
		}
		
		int right = 0;
		if(root.right != null){ 
			right = maxDepth(root.right);
		}
		
		int max = Math.max(left, right);
		
		return 1 + max;
		
    }
      
	
}
