
public class TwoSum {

	  public static int[] twoSum(int[] nums, int target) {

	        // we'll need to reference integers to satisify an output of two integers within a return array

	    int addendArray[] = new int[2];

	    for (int i = 0 ; i < nums.length-1 ; i++) {
	        for (int j = 1 ; j < nums.length ; j++) {

	            if (nums[i] + nums[j] == target && i != j) {
	                addendArray[0] = i;
	                addendArray[1] = j;
	                return addendArray;
	                }

	            }
	        }
	    return null;
	    }
	  public static void main(String args[]) {
		  
		  int testArray[] = { 2, 7, 11, 15 };
		  
		  System.out.println("Two sum success should indicate 0 and 1 for positions that add up to a target of 9");
		  
		  for(int s : twoSum(testArray, 9)) {
			  System.out.println(s);
		  }
		  
		  
	  }
}

