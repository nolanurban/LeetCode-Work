
public class ClimbStairs {

	public static int climbStairs(int n) {
		if (n <= 2) return n;
		int[] result = new int[n+1];
		
		result[0] = 0;
		result[1] = 1;
		result[2] = 2; // establish a base case
		
		for (int i = 3 ; i <= n ; i++) {
			result[i] = result[i-1] + result[i-2];
		} 
		return result[n];
 		
	}
	public static void main(String args[]) {
		System.out.println("Testing staircase 5, should return 8 : " + climbStairs(5));
	}
}
