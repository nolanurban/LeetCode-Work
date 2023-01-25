/* 
 * Given a string s, find the first non-repeating character in it and return its index. 
 * If it does not exist, return -1.
 */
public class UniqueCharacter {
    public static int firstUniqChar(String s) { // somehow this only beats 5%, I'm shocked.
    	for (int i = 0 ; i < s.length(); i++) {
    		System.out.println("Testing: " + s.charAt(i));
	    	if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
	    		return i;
    	}
    	return -1;
    }
    public static void main(String args[]) {
    	
    	String test = "bbbbbbbbbbba";
    	System.out.println("Checking position of first unique letter: " + firstUniqChar(test));
    	
    	
    }
}
