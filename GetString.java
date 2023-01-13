import java.util.HashSet;
import java.util.Set;

/* when given a string, return a string with no repeats
 * 
 * 
 * i.e. aabbccdd turns into abcd
 * 
 * 
 */
public class GetString {

	public static String getString(String input_str) {
		String returnString = "";
		
		Set<Character> charSet = new HashSet<>();
		char[] cArray = input_str.toCharArray();
		

		for (char c : cArray) charSet.add(c); // this will add all characters but no repeats.
		
		for (char c : charSet) {
			returnString += c;
		}
		return returnString;
		
	}
	public static void main(String args[]) {
		
		String testString = "aabbccdd";
		System.out.println(getString(testString));
		
	}

}
 