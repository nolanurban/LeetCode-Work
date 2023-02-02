
public class MaxSpan {
	public static int maxSpan(int[] nums) {
		 int span = 0;
		 if (nums.length == 0) return 0;
		 for (int i = 0 ; i < nums.length; i++) {
		   int j = nums.length-1; // right pointer
		   while (j > i) {
		     int distance = j - i;
		     if (nums[i] == nums[j]) {
		       if (distance > span) 
		        span = distance;
		      }
		     j--;
		   }
		 }
		 span++;
		 return span;
		}
	public static void main(String args[]) {
		int testArray[] = { 1, 2, 1, 1, 3 };
		
		System.out.println("Testing the array for max span: " + maxSpan(testArray));
		
	}
}
