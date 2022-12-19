// This one has multiple finishes -- I like the solutions that don't include the java tools but I also
// think the tools in Java are super awesome as well.

public class PalindromeNumber {

	public static boolean palindromeCheckByMath(int x) {

		// utilize a math algorithm that rebuilds the number in reverse and checks it against our original.
		int answer = 0;
		int originalNumber = x;
		
		while (originalNumber > 0) { 
			answer = answer * 10 + originalNumber % 10; // so this algorithm rebuilds the number by destroying the original, hence the need for a copy
			originalNumber /= 10; // we work our way digit by digit using modulo and multiplication so 121 on f
		}
		
		/* first round for 121
		 * answer = 1
		 * originalNumber = 12
		 * 
		 * second round for 121
		 * answer = 12 
		 * original Number = 1
		 * 
		 * third round for 121
		 * answer = 121 
		 * original number = 0 <-- loop break
		 * 
		 * 
		 */
		if (x == answer) 
			return true;
		
		else 
			return false;
		
		}
	
	public static boolean palindromeCheckByStringBuffer(int x) {
		StringBuilder reverseX = new StringBuilder(Integer.toString(x));
		/*
		 *  So, utilizing built in functionality, we can first convert the integer to string, 
		 *  then do a direct comparison to another string that is the same number, but reversed 
		 *  using the reverse() method. Finally, we convert the SB to printout our results with a toString().  
		 *  Pretty trick.
		 */
		if (Integer.toString(x).equals(reverseX.reverse().toString())) {
			return true;
		}
		return false;	
		// convert a string over and reverse it using built-in functionality
	}
	
	public static void main(String args[]) {
		int testInteger = 121;
		
		System.out.println("Trying palinedromeCheckByMath, answer should return true for 121 -- result : " + palindromeCheckByMath(testInteger));
		
		testInteger = 335;
		System.out.println("Trying palinedromeCheckByMath, answer should return false 335  -- result : " + palindromeCheckByMath(testInteger));

		testInteger = 121;
		System.out.println("Trying palindromeCheckByStringBuffer, answer should return true for 121 -- result : " + palindromeCheckByStringBuffer(testInteger));
		
		testInteger = 335;
		System.out.println("Trying palindromeCheckByStringBuffer, answer should return false 335  -- result : " + palindromeCheckByStringBuffer(testInteger));
	
		/*
		 * 
		 *  Unfortunately, both solutions are fairly slow with the StringBuilder only beating 4% and math beating only 31%.
		 * 
		 * 
		 */
	
	}
}
