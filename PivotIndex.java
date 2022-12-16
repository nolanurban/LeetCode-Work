
public class PivotIndex {
	
	  public static int pivotIndex(int[] nums) {
	        // begin by checking for case in example 3, eliminate the first element as pivot
	        int sum = 0;
	        for (int i = 1 ; i < nums.length ; i++)
	            sum += nums[i];
	        if (sum == 0) return 0;

	        int checkIndex = 1; // we need a variable that is going to move from left to right in 
	                            // the array and we'll increment it after we've satisified both 
	                            // sides being checked.
	        sum = 0;
	        while (checkIndex != nums.length) {

	            int sumLeft = 0;
	            int sumRight = 0;
	            for (int j = 0; j < checkIndex ; j++) { // beginning of array to index
	                sumLeft += nums[j];
	            }
	            for (int i = checkIndex+1 ; i < nums.length ; i++) { 
	                sumRight += nums[i];
	            }

	            if (sumLeft == sumRight) return checkIndex; 

	            checkIndex++;
	        }            
	                            // we need to return the position not the  value 

	        return -1; // if nothing found default output for no pivot index.

	    }
	  public static void main(String args[]) { 
		  int testArray[] = { 1, 7, 3, 6, 5, 6 }; // expected output should be 3.
		  
		  System.out.println(pivotIndex(testArray));
		  
		  
	  }
}
