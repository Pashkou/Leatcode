package linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
				
		ListNode dummy = new ListNode(0);
	    ListNode pre = dummy;
		while(l1 != null && l2 != null){
			if(l1.val <= l2.val) {
				pre.next = l1;
				l1 = l1.next;
			}else {
				pre.next = l2;
				l2 = l2.next;
			}
			pre = pre.next;
		}
		
		if(l1 != null) pre.next = l1;
        if(l2 != null) pre.next = l2;
        
		return dummy.next;
    }

	@Test
	public void test() {
		int[] input1 = {1,2,4};
		ListNode listNode1 = ListNode.initListNode(input1);
		
		int[] input2 = {1,3,4};
		ListNode listNode2 = ListNode.initListNode(input2);

		ListNode.iterateList( new MergeTwoSortedLists().mergeTwoLists(listNode1, listNode2));
	}

}
