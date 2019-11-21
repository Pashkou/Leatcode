package trees;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class MaximumDepthofBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}

		int resultLeft = maxDepth(root.left);
		int resultRight = maxDepth(root.right);

		return 1 + (resultLeft > resultRight ? resultLeft : resultRight);
	}

	public boolean isValidBST(TreeNode root) {
		return helper(root, null, null);
	}

	public boolean helper(TreeNode node, Integer lower, Integer upper) {
		if(node == null) return true;
		
		if (lower != null && node.val <= lower)
			return false;
		
		if (upper != null && node.val >= upper)
			return false;

		
		
		if(!helper(node.left, null, node.val)) {
			return false;
		}
		if(!helper(node.right, node.val, null)) {
			return false;
		}
		
		
		return true;
	}


	public boolean isSymmetric(TreeNode root) {
		Stack<TreeNode> stack = new Stack();
		
		stack.add(root);
		stack.add(root);
		
		while(!stack.isEmpty()) {
			TreeNode t1 = stack.pop();
			TreeNode t2 = stack.pop();
			if (t1 == null && t2 == null) continue;
			if (t1 == null || t2 == null) return false;
			
			if(t1.val == t2.val) {
				stack.add(t1.left);
				stack.add(t2.right);
				stack.add(t1.right);
				stack.add(t2.left);
			}else {
				return false;
			}
			
		}
		return true;
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		
		Stack<TreeNode> stack = new Stack();
		result.add(new ArrayList<>());
		
		stack.add(root);
		stack.add(root);
		
		while(!stack.isEmpty()) {
			TreeNode t1 = stack.pop();
			TreeNode t2 = stack.pop();
			//if (t1 == null && t2 == null) continue;
			//if (t1 == null || t2 == null) return false;
			
			if(t1.val == t2.val) {
				stack.add(t1.left);
				stack.add(t2.right);
				stack.add(t1.right);
				stack.add(t2.left);
			}
			
		}
		
		
		return null;
    }

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
