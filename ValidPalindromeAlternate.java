
public class ValidPalindromeAlternate {
	/*
	 * It's an easy problem IF you know your regex I did try this problem by
	 * utilizing loops and got stuck of course due to the fact it's not alphabetical
	 * utilizing limits of 96 and 122 but rather it's also 0-9.
	 * 
	 * 
	 */
	public static boolean isPalindrome(String s) {

		int leftPointer = 0;
		int rightPointer = s.length()-1;
		
		while (leftPointer < rightPointer) {
			
			char leftCharacter 	= s.charAt(leftPointer);
			char rightCharacter = s.charAt(rightPointer);
			
			if (!Character.isDigit(leftCharacter) && !Character.isAlphabetic(leftCharacter)) {
				leftPointer++;
				continue;
			}
			
			if (!Character.isDigit(rightCharacter) && !Character.isAlphabetic(rightCharacter)) {
				rightPointer--;
				continue;
			}
			
			if (Character.toLowerCase(leftCharacter) != Character.toLowerCase(rightCharacter)) {
				return false;
			}
			leftPointer++;
			rightPointer--;
 		}
		return true;
		
	}

	public static void main(String args[]) {
		String test = "Mr. Owl ate my metal worm.";
		System.out.println("Checking if palindrome valid: " + isPalindrome(test));
	}

}
