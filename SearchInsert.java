
public class SearchInsert {
	  public static int searchInsert(int[] nums, int target) {
	        // iterate through the array comparing the target to the nums[iteration]
	        // if nothing found, return the length of nums;
	        int placeholder = 0;
	        for (int i = 0 ; i < nums.length ; i++) {
	            if (nums[i] == target) return i;
	            if (target > nums[i]) placeholder = i + 1; 
	            // we utilize a placeholder in order to keep track of index position.  We add one because if it is not in the array, it has to be greater in position than the last time it indexed.
	        }
	        return placeholder;
	    }
	  public static void main(String args[]) {
		  
		  int numArray[] = { 1, 2, 3, 4, 5, 6, 7 };
		  
		  System.out.println("Searching array for the number 6, should return a 5 : " + searchInsert(numArray, 6));
		  
	  }
}
