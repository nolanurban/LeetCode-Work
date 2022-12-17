
public class MiddleNode {
    public static ListNode middleNode(ListNode head) {
        int counter = 0;
        ListNode countHead = head;  // create a copy and work my way down counting as I go.

        // determine second middle node off of an integer count / 2

        while (countHead != null) {
            countHead = countHead.next;
            counter++;
        }

        int half = counter / 2;

        for (int i = 0; i < half ; i++) {
            head = head.next;
        } 
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

    	System.out.println("ALL NODES");
    	ListNode firstLoop = a;
    	
    	while(firstLoop != null) {
    		System.out.println(firstLoop.val);
    		firstLoop = firstLoop.next;
    	}
    	System.out.println("MIDDLE NODES");
    	ListNode outputNode = middleNode(a);
    	
    	while(outputNode != null) {
    		System.out.println(outputNode.val);
    		outputNode = outputNode.next;
    	}
    	//output should be 3-4-5
    }
}
