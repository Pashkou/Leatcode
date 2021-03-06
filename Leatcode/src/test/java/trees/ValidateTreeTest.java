package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateTreeTest {

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
	
	private boolean helper(TreeNode root, Integer lower, Integer upper){
        
        if(root == null) return true;
        
        if(((lower!=null) && (root.val < lower)) || (upper!=null && root.val > upper))
        {
            return false;
        }
        
        
        if (!helper(root.left,lower,root.val) || !helper(root.right,root.val,upper)){
            return false;
        }
        
        return true;
    }

}
