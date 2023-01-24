/* 
 * Given a string s, find the first non-repeating character in it and return its index. 
 * If it does not exist, return -1.
 */
public class UniqueCharacter {
    public static int firstUniqChar(String s) {
        // looking for any non repeating letter the first time
        // could I utilize contains() in a string checking it for an i (our current charAt position)
        // and check i+1 -> s.length()
        // if yes, keep going
        // if no, return index i

    	for (int i = 0 ; i < s.length(); i++) {
    		for (int j = i + 1 ; j < s.length() ; j++) {
    			System.out.println("Checking " + s.charAt(i) + " against " + s.charAt(j));
    			if (s.charAt(i) == s.charAt(j)) { 
    				System.out.println("Breaking");
    				break;
    			}
    			if (j == s.length()-1) return i;
    		}
    	}
    	return -1;
    }
    public static void main(String args[]) {
    	
    	String test = "loveleetcode";
    	System.out.println("Checking position of first unique letter: " + firstUniqChar(test));
    	
    	
    }
}
