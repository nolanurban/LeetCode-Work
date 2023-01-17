
public class IsPowerOfThree {

    public static boolean isPowerOfThree(int n) {
    long power = 3;
    if (n == 1 || n == power) return true;
    if (n % 3 != 0) return false;
    for (int i = 0 ; i <= n ; i++) {
        power *= 3;
        if (power == n) return true;
        else if (power > n) return false;
    }

    	return false;
    }
    public static void main(String args[]) {
    	System.out.println("Testing 27, should return true: " + isPowerOfThree(27));
    }
}
