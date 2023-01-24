
public class LengthOfLongestSubString {
	
	  public static int lengthOfLongestSubstring(String s) {
		  
	        if (s.length() == 1) return 1;
	        if (s.length() == 2 && s.charAt(0) != s.charAt(1)) return 2;

	        int maxLength = 0; // establish the size, this will change after nested loop.
	        int right = 0;
	        for (int left = 0; left < s.length() ; left++) { // i is our left pointer  
	            while (right < s.length()-1) {  // j should be our right pointer.
	                String check = s.substring(left, right+1);
	                String checkLetter = s.substring(right+1, right+2);
	                
	                System.out.println("Testing " + check + " against " + checkLetter);
	                System.out.println("check length: " + check.length());
	                if (check.contains(checkLetter)) {
	                	System.out.println(check.length());
	                	if (check.length() > maxLength)
	                			maxLength = check.length();
	                	break;
	                }
	                right++;
	            }
	            // adjust the right here.
	        }
	        return maxLength;
	  }
	  public static void main(String args[]) {
		  
		  String test = "au";
		  
		  System.out.println("Testing " + test + " and the max substring is: " + lengthOfLongestSubstring(test));
		  
		  
	  }
}
