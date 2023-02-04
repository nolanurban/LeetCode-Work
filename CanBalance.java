
public class CanBalance {

		public static boolean canBalance(int nums[]) {
			
			int leftSum = 0, rightSum = 0;
			
			for (int i = 0 ; i < nums.length ; i++) {
				leftSum += nums[i];
				for (int j = i + 1 ; j < nums.length ; j++) {
					rightSum += nums[j];
				}
				if (leftSum == rightSum) return true;
				rightSum = 0;
			} 
			return false;
		}
		
		public static void main(String args[]) {
			
			int test[] = { 1, 1, 1, 2, 1 };
			int test2[] = { 2, 1, 1, 2, 1 };
			
			System.out.println("Checking first array, should be true: " + canBalance(test));
			System.out.println("Checking second array, should be false: " + canBalance(test2));
			int t[] = { 10, 10 };
			System.out.println(canBalance(t));
		}
}
 