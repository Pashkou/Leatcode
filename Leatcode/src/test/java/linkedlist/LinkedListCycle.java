package linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		if(head == null) {
			return false;
		}
		
		ListNode slow = head;
		ListNode fast = head.next;
		
		while(fast != null) {
			if(fast.val == slow.val) {
				return true;
			}
			slow = slow.next;
			fast = fast.next;
			if(fast != null) { fast = fast.next;}
		}
		return false;
    }

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
