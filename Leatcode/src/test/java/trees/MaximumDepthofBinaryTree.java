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
	
    public boolean isValidBST(TreeNode root) {
    	return helper(root, null, null);
    }

    public boolean helper(TreeNode root, Integer leftLimit, Integer rigthLimit) {
    	if(root == null) {
    		return true;
    	}
    	
    	if((rigthLimit == null)&&(leftLimit == null)) {
    		if((root.val > root.left.val) && (root.val < root.right.val)) {
    			boolean fromLeft = helper(root.left, root.val, null);
    	    	boolean fromRight = helper(root.right, null, root.val);
    			return fromLeft && fromRight;
    		} else {
    			return false;
    		}
    		
    	}
    	
    	
    	if((rigthLimit == null)&&(leftLimit != null)) {
    		if(root.val < leftLimit) {
    			boolean fromLeft = helper(root.left, root.val, null);
    	    	boolean fromRight = helper(root.right, null, root.val);
    			return fromLeft && fromRight;
    		} else {
    			return false;
    		}
    		
    	}
    	
    	if((leftLimit == null)&&(rigthLimit != null)) {
    		if(root.val > rigthLimit) {
    			boolean fromLeft = helper(root.left, root.val, null);
    	    	boolean fromRight = helper(root.right, null, root.val);
    			return fromLeft && fromRight;
    		}else {
    			return false;
    		}
    	}
    	    	
    	
    	return true;
    }
    
    
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
