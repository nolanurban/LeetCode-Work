// Coding Bat Problem CountX recursion.  Checks using CharAt and returns countX with a sliced off array 

public class CountX {

	public static int countX(String s) {
		if (s.length() == 0)
			return 0;

		if (s.charAt(0) == 'x') {
			System.out.println("Found x at " + s);
			return 1 + countX(s.substring(1));
		}
		System.out.println(s);
		return countX(s.substring(1));
	}

	public static void main(String args[]) {
		String test = "xxivxx";

		System.out.println(countX(test));

	}
}
