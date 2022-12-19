import java.util.HashMap;

/*
 * Convert Roman numerals to integers:
 * 
 * Odd caveat is that placing an "I" in front of a V or an X reduces it by one
 * 
 * Placing an "X" in front of L or a C reduces it by ten
 * 
 * placing a C before a D or M reduces it by 100.
 * 
 * 
 * I'll start by using a hashmap and storing all the pertinent KVs and then work to do checking based on those situations
 * 
 */
public class RomanToInteger {

	public static int romanToInt(String s) {
		HashMap<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		// prep for the weird stuff.
		s = s.replace("IV", "IIII");
		s = s.replace("IX", "VIIII");
		s = s.replace("XL", "XXXX");
		s = s.replace("XC", "XXXXXXXXX");
		s = s.replace("CD", "CCCC");
		s = s.replace("CM", "CCCCCCCCC");
		// create a character array, iterate through, and sum
		int sum = 0;
		char romanCharArray[] = s.toCharArray();
		for (char c : romanCharArray) {
			sum += romanMap.get(c);
		}
			return sum;
	}
	
	public static void main(String args[]) {
		
		
		String test[] = { "III", "XXXVIII", "LVIII", "MCMXCIV", "IV" }; // returns 3;
		

		for (String t : test)
			System.out.println("Testing Roman Numeral: " + t + " Result: " + romanToInt(t));
	}
}
