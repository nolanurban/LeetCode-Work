import java.util.HashMap;
import java.util.Map;

/*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order
Every close bracket has a corresponding open bracket of the same type.


 */
public class IsValid {
	
	public static boolean isValid(String s) {
		boolean ourFlag = false;
		char checkArray[] = { '(', ')', '[', ']', '{', '}' };
		
		char charArray[] = s.toCharArray();
	
		Map<Character, Integer> checkMap = new HashMap<>();
		
		for (int i = 0 ; i < charArray.length ; i++) {
			checkMap.put(charArray[i], i+1);
		}

		if (checkMap.containsKey(checkArray[0]))  {
				if (!checkMap.containsKey(checkArray[1])) { 
					ourFlag = false;;
				}
				else if (checkMap.get(checkArray[0]) - checkMap.get(checkArray[1]) == -1) {
					ourFlag = true;
				}
				else
					ourFlag = false;
			}
		
		if (checkMap.containsKey(checkArray[2]))  {
			if (!checkMap.containsKey(checkArray[3])) { 
				ourFlag = false;
			}
			else if (checkMap.get(checkArray[2]) - checkMap.get(checkArray[3]) == -1) {
				ourFlag = true;
			}
			else
				ourFlag = false;
		}

		
		if (checkMap.containsKey(checkArray[4]))  {
			if (!checkMap.containsKey(checkArray[5])) { 
				ourFlag = false;;
			}
			else if (checkMap.get(checkArray[4]) - checkMap.get(checkArray[5]) == -1)
				ourFlag = true;
			else
				ourFlag = false;
		}
		
		// pass all the conditions, its true.
		
		System.out.println(checkMap);
		return ourFlag;
		
	}
	
	public static void main(String args[]) {
		
		String test = "{[()]}";
		System.out.println(isValid(test));
		
	}
}
