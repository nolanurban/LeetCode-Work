/*  It's an easy problem IF you know your regex
 *  I did try this problem by utilizing loops and got stuck of course due to the fact it's not
 *  alphabetical utilizing limits of 96 and 122 but rather it's also 0-9.
 *  
 *  
 */
public class ValidPalindrome {
	  public static boolean isPalindrome(String s) {
		  
		 String filtered = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		 System.out.println(filtered);
		 StringBuilder sb = new StringBuilder(filtered);
		 return sb.reverse().toString().equals(filtered);
	  }

	  
	  public static void main(String args[]) {
		  String test = "Mr. Owl ate my metal worm.";
		  System.out.println("Checking if palindrome valid: " + isPalindrome(test));
	  }
}
