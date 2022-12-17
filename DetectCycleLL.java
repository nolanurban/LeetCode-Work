import java.util.HashSet;
import java.util.Set;

public class DetectCycleLL {

	public static ListNode detectCycle(ListNode head) {
	       Set<ListNode> ln = new HashSet<>();
	        while (head != null) {
	            if (!ln.add(head)) {
	                return head;
	            }
	            head = head.next;
	        }
	        head = null;
	        return head;
}
   
	public static void main(String args[]) {
		ListNode list1 = new ListNode();
		ListNode a  = new ListNode();
		ListNode b  = new ListNode();

		list1.val = 1;
		list1.next = a;
		a.val = 2;
		a.next = b;
		b.val = 4;
		b.next = null; // not looped
		
	
		ListNode list2 = new ListNode();
		ListNode d = new ListNode();
		ListNode e = new ListNode();
		ListNode f = new ListNode();
		ListNode g = new ListNode();

		list2.val = 1;
		list2.next = d;
		d.val = 2;
		d.next = e;
		e.val = 3;
		e.next = f;
		f.val = 4;
		f.next = g;
		g.val = 5;
		g.next = d; // looped
		System.out.println("OK");
		ListNode check = detectCycle(list2);
		System.out.println("Our value in example should be: 2 and it is: " + check.val);
		
	}
}
