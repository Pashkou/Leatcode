package linkedlist;

import static org.junit.Assert.fail;

import org.junit.Test;

public class DeleteNodeInLinkedList {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
    }
	
	public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
