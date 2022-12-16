
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        
        if (s.length() < 1) return true;
        int lastIndex = 0;

        for (int i = 0 ; i < s.length() ; i++) {
            for (int j = lastIndex ; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    lastIndex++;
                        if (i == s.length()-1) 
                            return true;
                    break;
                }
                lastIndex++;
                if (j == t.length()-1 && s.charAt(i) != t.charAt(j)) 
                    return false;
            }
            
        }
        return false;
    }
    public static void main(String args[]) {
    	String testString1 = "abc";
    	String testString2 = "ahbgdc";
    	
    	System.out.println("Is string1 a subsequence of string2?  " + testString1 + " : " + testString2);
    	System.out.println(isSubsequence(testString1, testString2));
    	}
}
