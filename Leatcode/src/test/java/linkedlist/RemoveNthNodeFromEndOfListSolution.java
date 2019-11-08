package linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveNthNodeFromEndOfListSolution {


	/*public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode first = head;
		ListNode second = head;
		
		for(int i = 0; i < n; i++) {
			first = first.next;
		}
		
		while(first.next != null) {
			first = first.next;
			second = second.next;
		}
		
		second.next = second.next.next;
		
		return head;
	}*/
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode first = dummy;
	    ListNode second = dummy;
	    // Advances first pointer so that the gap between first and second is n nodes apart
	    for (int i = 1; i <= n + 1; i++) {
	        first = first.next;
	    }
	    // Move first to the end, maintaining the gap
	    while (first != null) {
	        first = first.next;
	        second = second.next;
	    }
	    second.next = second.next.next;
	    return dummy.next;
	}

	
	
	@Test
	public void test() {
		int[] input = {1,2,3,4,5};
		ListNode listNode = ListNode.initListNode(input);
		
		ListNode.iterateList( new RemoveNthNodeFromEndOfListSolution().removeNthFromEnd(listNode, 2));
	}

}
