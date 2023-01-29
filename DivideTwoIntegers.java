/*
 Given two integers dividend and divisor, divide two integers without using multiplication, division, 
 
 and mod operator. The integer division should truncate toward zero, which means losing its fractional part. 
 
 For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.

 I'll need to learn more about Bitwise operators.
 */
public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
    	int count = 0;
    	
    	while (dividend > divisor) {
    		System.out.println(dividend);
    		dividend -= divisor;
    		count++;
    	}
    	return count;
    }
    public static void main(String args[]) {
    	int dividend = 25;
    	int divisor = 4;
    	System.out.println("Dividing " + dividend + " / " + divisor + " without dividing or multiplying or adding: " + divide(25, 4));
    	System.out.println("Dividing using println function: " + dividend / divisor);
    }
} 
