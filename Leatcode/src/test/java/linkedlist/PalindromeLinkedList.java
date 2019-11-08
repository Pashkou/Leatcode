package linkedlist;

import java.util.Stack;

import org.junit.Test;

public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {
		ListNode current = head;
		
		Stack<ListNode> stack = new Stack<>();
		while(current!=null) {
			stack.push(current);
			current = current.next;
		}

		boolean result = true;
		current = head;
		while(current!=null) {
			ListNode pop = stack.pop();
			if(pop.val != current.val) {
				return false;
			}
			current = current.next;
		}
		
		return result;
    }


	@Test
	public void test() {
		int[] input = {1,2,2,1};
		ListNode listNode = ListNode.initListNode(input);
		
		System.out.println(new PalindromeLinkedList().isPalindrome(listNode));
	}

}
