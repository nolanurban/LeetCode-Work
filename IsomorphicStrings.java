import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> checkMap = new HashMap<Character, Character>();

        for (int i = 0 ; i < s.length() ; i++) { // establish a main loop.
            char a = s.charAt(i);
            char b = t.charAt(i); // establish the letter by letter check

            if (checkMap.containsKey(a)) { // do we actually have a populated array?
                    if (checkMap.get(a).equals(b)) { // if so check it
                            continue;
                    }
                        else {
                            return false; // this is our actual check

                        }
                }
            else {
                if (!checkMap.containsValue(b)) {
                        checkMap.put(a, b); // insert the values into the array.
                }
                else {
                    return false; // second check 
                }
            }

        }
        return true; // if it passes through both map checks, it returns true
    }
    public static void main(String args[]) {
    	String testString1 = "egg";
    	String testString2 = "add";    
    	
    	System.out.println("Are these two strings isomorphic? " + testString1 + " : " + testString2);
    	System.out.println(isIsomorphic(testString1, testString2));
    
    }
}
