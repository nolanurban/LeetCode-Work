
public class AddTwoNumbers {

	   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        // capture the numbers from l1 and l2 
		   
		   return l1;
	        
	    }

		public static void main(String args[]) {
			
			ListNode l1 = new ListNode(2, 
							new ListNode(4, 
								new ListNode(3)));
			ListNode l2 = new ListNode(5, 
							new ListNode(6, 
								new ListNode(4)));

			ListNode head = l1;
			ListNode head2 = l2;
			String addend1 = "";
			String addend2 = "";
			while (head != null && head2 != null) {
				addend1 += head.val;
				addend2 += head2.val;
				head = head.next;
				head2 = head2.next;
			}
			StringBuilder sb1 = new StringBuilder(addend1).reverse();
			int ourNum1 = Integer.valueOf(sb1.toString());
			StringBuilder sb2 = new StringBuilder(addend2).reverse();
			int ourNum2 = Integer.valueOf(sb2.toString());
			StringBuilder total = new StringBuilder(String.valueOf(ourNum1 + ourNum2)).reverse();
			int ourTotal = Integer.valueOf(total.toString());
			
			ListNode returnNode = new ListNode();
			while (ourTotal > 0) {
				System.out.println("Modulo storage: " + ourTotal % 10);
				int value = ourTotal % 10;
				ourTotal /= 10;
//				
				
//				if (ourTotal / 10 == ourTotal) 
//					{
//					returnNode.next = null; 
//					break;
//					}
			
				
			}
			returnNode.next = null;
			
			ListNode head3 = returnNode;
			
			while (returnNode != null) {
				System.out.println("****");
				System.out.println(returnNode.val);
				returnNode = returnNode.next;
			}
		}
		
		     
}
