package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumDepthofBinaryTree {
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	
	public int maxDepth(TreeNode root) {
        if(root == null) {
        	return 0;
        }
        
        if(root.left == null && root.right == null) {
        	return 1;
        }
        
        int resultLeft = maxDepth(root.left);
        int resultRight = maxDepth(root.right);
        
        
		
		return 1 + (resultLeft > resultRight ? resultLeft : resultRight);
    }

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
