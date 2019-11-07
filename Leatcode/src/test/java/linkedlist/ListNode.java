package linkedlist;

public class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
	
	public static ListNode initListNode(int[] array) {
		ListNode lastElement = new ListNode(array[0]);
		ListNode head = lastElement;
		for(int i = 1; i < array.length; i++) {
			ListNode newElement = new ListNode(array[i]);
			
			lastElement.next = newElement;
			lastElement = newElement;
		}
		return head;
	}
	
	
	public static void iterateList(ListNode listNode) {
		ListNode currentNode = null;
		do {
			if(currentNode == null) {
				currentNode = listNode;
			}else {
				listNode = listNode.next;
			}
			System.out.println(listNode.val);
		}while(listNode.next != null);
	} 
	
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5};
		ListNode listNode = ListNode.initListNode(input);
		ListNode.iterateList(listNode);
	}
	
	
}
