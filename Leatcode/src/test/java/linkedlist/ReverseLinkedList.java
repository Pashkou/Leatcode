package linkedlist;

import static org.junit.Assert.fail;

import java.util.Stack;

import org.junit.Test;

public class ReverseLinkedList {

	
	public ListNode reverseList2(ListNode head) {
	    
		ListNode prev = null;
		ListNode current = head;
		
		while(head.next != null) {
			ListNode temp = current.next;
			current.next = prev;
			prev = current;
		    current = temp;
		}
		
		return head;
		
	}
	
	
	public ListNode reverseList(ListNode head) {
		if(head.next == null) return head;
		ListNode result = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return result;
	}

	public int sum(int result) {
		if(result > 0) {
			result--;
			System.out.println("dominus");
			return sum(result);
		}
		return result;
	}
	
	
	@Test
	public void test() {
		/*int[] input = {1,2,3,4,5};
		ListNode listNode = ListNode.initListNode(input);
		
		ListNode.iterateList(new ReverseLinkedList().reverseList(listNode));
		*/
		new ReverseLinkedList().sum(5);
		
	}

}
