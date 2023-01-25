import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString {

	public static int lengthOfLongestSubstring(String s) {

		if (s.length() == 1)
			return 1;
		if (s.length() == 2 && s.charAt(0) != s.charAt(1))
			return 2;

		int maxLength = 0; // establish the size, this will change after nested loop.
		int right = 0;
		for (int left = 0; left < s.length(); left++) { // i is our left pointer
			while (right < s.length() - 1) { // j should be our right pointer.
				String check = s.substring(left, right + 1);
				String checkLetter = s.substring(right + 1, right + 2);

				System.out.println("Testing " + check + " against " + checkLetter);
				System.out.println("check length: " + check.length());
				if (check.contains(checkLetter)) {
					System.out.println(check.length());
					if (check.length() > maxLength)
						maxLength = check.length();
					break;
				}
				right++;
			}
			// adjust the right here.
		}
		return maxLength;
	}

	public static int lengthOfLongestSubstringHashSet(String s) {
		int returnValue = 0; // we'll need a conditional to check if the match string is >
		String storageString = ""; // we'll use this to concatenate unique strings and glean a value from
		
		// this brute force model will need a nested loop but we'll start with a quick pass run through
		int startingPoint = 0;
		while (startingPoint < s.length())
		{ // we can also set this to where the distance has to be greater than the returnString length
			Set<Character> checkMap = new HashSet<>();
			for (int i = startingPoint ; i < s.length() ; i++) {
				System.out.println("Checking : " + s.charAt(i));
				if (checkMap.contains(s.charAt(i))) { // hit a repeat
					System.out.println("hit a repeat");
					break;
				}
				else {
					checkMap.add(s.charAt(i)); // we'll utilize the set to track matching
					storageString += s.charAt(i); // but we'll concurrently put it into a string 
				}
			}
			if (storageString.length() > returnValue) 
				returnValue = storageString.length();
			System.out.println("Currently longest : " + returnValue);
			startingPoint++;
			System.out.println(storageString);
			storageString = "";
			System.out.println(storageString);

		}
		
		
		
		return returnValue;
	}

	public static void main(String args[]) {

		String test = "bbbbb";

//		  System.out.println("Testing " + test + " and the max substring is: " + lengthOfLongestSubstring(test));
		System.out.println("Testing " + test + " and the max substring is: " + lengthOfLongestSubstringHashSet(test));

	}
}
