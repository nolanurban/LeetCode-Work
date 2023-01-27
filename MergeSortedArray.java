
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // so we need to not only append nums2 onto nums1, but it needs to be sorted 
    	// as well.  So first if statement starting from the rear should be:
    	// if nums2[element] > nums1[element] --> replace it
    	// so leftPointer = m-1, right pointer (in the other array) = n-1, lastPointer = m+n-1
    	
    	int leftPointerNums1 = m - 1;
    	int rightPointerNums2 = n - 1;
    	int rightPointerNums1 = m + n - 1;
    	
    	while(rightPointerNums2 >= 0) {
    		
    		// this is only checking first array
    		if (leftPointerNums1 >= 0 && nums1[leftPointerNums1] > nums2[rightPointerNums2]) {
    			
    			nums1[rightPointerNums1] = nums1[leftPointerNums1];
    			leftPointerNums1--;
        		rightPointerNums1--;
    		}
    		else { // does this make the assumption its always going to work?
    			nums1[rightPointerNums1] = nums2[rightPointerNums2];
    			rightPointerNums1--;
        		rightPointerNums2--;
    	
    		}

    		
    		
    	}
    	
    	
    	
    }
    
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
    	
    	
    }

    public static void main(String args[]) {
    	int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    	int m = 3;
    	int[] nums2 = { 2, 5, 6 };
    	int n = 3;
    	
    	System.out.println("Printing original array: ");
    	for (int a : nums1) System.out.print(a + " ");
    	System.out.println();
    	merge(nums1, m, nums2, n);
       	System.out.println("Printing post-merge array: ");
    	for (int a : nums1) System.out.print(a + " ");
    	
    	
    }
}
