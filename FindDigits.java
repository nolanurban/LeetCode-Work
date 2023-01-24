/* Given an integer, for each digit that makes up the integer determine whether 
 * it is a divisor. Count the number of divisors occurring within the integer.
 */
public class FindDigits {
    public static int findDigits(int n) {
        
    int divisorCount = 0;  // we'll use this to count the number of applicable divisors.
    int originalNumber = n;
    while (n > 0) {
        int divisor = n % 10;
        System.out.println(n + " " + divisor);
        if (divisor != 0 &&  originalNumber % divisor == 0) {
        	System.out.println("divisible");
        	divisorCount++;
        }
        n /= 10;
    }
    
    return divisorCount;
    }
    
    public static void main(String args[]) {
    	int nums[] = {
    	11,
    	123456789,
    	114108089,
    	110110015,
    	121,
    	33,
    	44,
    	55,
    	66,
    	77,
    	88,
    	106108048 };
    	for (int n : nums)
    	System.out.println("checking digit count on " + n + " - " + findDigits(n));
    }
}
