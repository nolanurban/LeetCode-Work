
public class MergeTwoLists {

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head = new ListNode(0);
        ListNode currentPos = head;
             

        while (list1 != null && list2 != null) {
            
            if (list2.val <= list1.val ) {
                currentPos.next = list2;
                list2 = list2.next;
            }

            else {
                currentPos.next = list1;
                list1 = list1.next;
            }

            currentPos = currentPos.next;
            
        }
        if (list1 == null) 
            currentPos.next = list2;
        if (list2 == null) 
            currentPos.next = list1;
            
    return head.next;
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
		b.next = null;
		
	
		ListNode list2 = new ListNode();
		ListNode d = new ListNode();
		ListNode e = new ListNode();
		list2.val = 1;
		list2.next = d;
		d.val = 3;
		d.next = e;
		e.val = 5;
		e.next = null;
		
		ListNode sortedNodes = mergeTwoLists(list1, list2);
		
		while (sortedNodes != null) {
			System.out.println(sortedNodes.val);
			sortedNodes = sortedNodes.next;
		}
	}
	
}
