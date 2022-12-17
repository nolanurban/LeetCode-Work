import java.util.HashMap;
import java.util.Map;

public class allSwap {

	public static String[] allSwap(String[] strings) {
		Map<String, Integer> checkMap = new HashMap<>();
		  // Match: not empty & first char is same
		  // Convert a string array into a map and add it to a new return array;
		    // we'll need to examine the first letter of each string
		
		// reverse the array integer pattern?
		
		
		for (int i = 0 ; i < strings.length; i++) {
			String key = strings[i].substring(0,1);
			
			if (checkMap.containsKey(key)) {
				int index = checkMap.get(key);
				String placeholder = strings[index]; 
				strings[index] = strings[i];
				strings[i] = placeholder;
				checkMap.remove(key);
			}
			else {
				checkMap.put(key,  i);
			}
			
		}

		return strings;
		
	}
	public static void main(String args[]) {
		String[]  testArray = { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" };
		
		for (String s : allSwap(testArray))
			System.out.println(s);
	}
	
}

/*

We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.


allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
*/