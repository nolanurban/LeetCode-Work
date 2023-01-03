
/*
 * Reverse was a particular pain because the test cases on leetcode went to 2^31-1 power and its negative opposite.  I had to convert 
 * the x to a long in order to surpass it and add in a boolean flag check to convert the number over and then back.
 */

public class ReverseInteger {
    public  static int reverse(int x) {
        long result = 0;
        long test = x;
        boolean negativeFlag = false;
        if (x < 0) {
            System.out.println("x is negative");
            negativeFlag = true; 
            test *= -1;
        }
        if (test >= Integer.MAX_VALUE-1) return 0;

        while (test != 0) {
            result *= 10;
            result += test % 10;
            test /= 10;
        if (result > Integer.MAX_VALUE-1) return 0;
        }
        if (negativeFlag) result *= -1;

    return (int)result;
    }
	public static void main(String args[]) {
		System.out.println("Running reverse of 31337 should result with its reverse: " + reverse(31337));
	}
}
