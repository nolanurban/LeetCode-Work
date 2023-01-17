import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        
        // length check
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0 ; i < s.length() ; i++) { 
            if (sMap.containsKey(s.charAt(i))) {
                int value = sMap.get(s.charAt(i));
                value++;
                sMap.replace(s.charAt(i), value);
            }
            else 
                sMap.put(s.charAt(i), 1);
        }
        for (int i = 0 ; i < s.length() ; i++) { 
            if (tMap.containsKey(t.charAt(i))) {
                int value = tMap.get(t.charAt(i));
                value++;

                tMap.replace(t.charAt(i), value);
            } else      
                tMap.put(t.charAt(i), 1);
        
        }

        if (!sMap.equals(tMap))
                return false;
    

        return true;

    }
    public static void main(String args[]) {
    	String test = "anagram";
    	String testanagram = "nagrama";
    	
    	System.out.println("Testing function, should return true for anagram: " + isAnagram(test, testanagram));
    	
    }
}
