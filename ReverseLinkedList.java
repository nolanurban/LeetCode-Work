
public class ReverseLinkedList {

	public static ListNode reverseList(ListNode head) {
		ListNode previous = null; // we establish a previous node to reverse toward
		while (head != null) {
			ListNode next = head.next; // we establish the forward node called next
			head.next = previous; // reverse head.next
			previous = head; // full turned
			head = next; // now move down the node
		}
		head = previous; // set head to the last spot
		return head;
	}
	
	public static void main(String args[]) {
		ListNode a = new ListNode();
		ListNode b = new ListNode();
		ListNode c = new ListNode();
		ListNode d = new ListNode();
		ListNode e = new ListNode();

		a.val = 1;
		b.val = 2;
		c.val = 3;
		d.val = 4;
		e.val = 5;
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		ListNode testNode = a;
		System.out.println("BEFORE REVERSAL");
		while (testNode != null) {  // make sure the nodes are linked correctly.
			System.out.println(testNode.val);
			testNode = testNode.next;
		}
		System.out.println("AFTER REVERSAL");
		ListNode testNode2 = reverseList(a);
		while (testNode2 != null) {  // make sure the nodes are linked correctly.
			System.out.println(testNode2.val);
			testNode2 = testNode2.next;
		}

	}
}
