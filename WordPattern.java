import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static boolean wordPattern(String pattern, String s) {
        /* this seems similar to the hash mapping sequence I've worked on before
        *
        *  thus:
        * abba and dog cat cat dog means the key value 'a' is stored as a character and the key is a string 'dog' 
        * value 'b' is stored with the value 'cat'
        * then, we parse through the string s by utilizing a to Array, and store each new value 
        * 'a' = 'dog', 'b' = 'cat', 'a' is disregarded since it exists, 'b' is disregarded as it exists
        * key(a, 'dog') else return a false 
        * key(any-other-letter-that-doesn't-have-value, 'word doesnt exit') returns false
        */

        Map<Character, String> checkMap = new HashMap<>();

        char patternCharArray[] = pattern.toCharArray(); // establish our pattern array
        String checkSequence[] = s.split(" "); // break apart our pattern 

        // iterate through patternCharArray and store the hash map according to the values
        // one check will be first if the lengths of the arrays match.

        if (patternCharArray.length !=  checkSequence.length) return false;

        for (int i = 0 ; i < patternCharArray.length ; i++) {
            // create a condition to see if the key exists and is assigned NOT the same value
            if (checkMap.containsValue(checkSequence[i])) { // does it have our value
                if (checkMap.get(patternCharArray[i]) == null) // if it's a repeat, it will return a null value
                    return false;
            }
            if (checkMap.containsKey(patternCharArray[i])) {
                if (!checkMap.get(patternCharArray[i]).equals(checkSequence[i])) {
                    return false;
                } 
            }
            // throw in some debugging
            checkMap.put(patternCharArray[i], checkSequence[i]); // this will  assign letter 'a' to 'dog'
        }

        // if all goes well, return true;
        return true;

    }
	
	public static void main(String args[]) {
		
		String s = "dog cat cat dog";
		String input = "abba";
		
		System.out.println("Trying abba vs dog cat cat dog -- should return true : " + wordPattern(input, s));
		
		
	}
}
