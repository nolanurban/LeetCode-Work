import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
	   public static int longestPalindrome(String s) {
	        Map<Character, Integer> checkMap = new HashMap<>();
	        int charCounter = 0;
	        int pairCount = 0;
	        char charArray[] = s.toCharArray();
	        int defaultValue = 1;
	        for (char c : charArray) {
	            if (checkMap.containsKey(c)) {
	                pairCount++;
	                checkMap.remove(c);
	            }
	            else
	                checkMap.put(c, 1); 
	        }
	        if (checkMap.size() == 0) {
	            charCounter = (pairCount * 2);
	        }
	        else if (checkMap.size() > 2){
	            charCounter = (pairCount * 2) + 1;
	        }
	        else charCounter = (pairCount * 2) + 1;
	        
	        return charCounter;
	    }
	   public static void main(String args[]) {
		   
		   String test = "abccccdd";
		   System.out.println("Testing to see the longest palindrome possible with any arrangement -- should be 7 - Result: " + longestPalindrome(test));
		   
	   }
}