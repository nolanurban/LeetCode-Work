/*
 * I decided to really know sorting methods, I should work them on my own
 * 
 */
public class InsertionSortExample {

	public static int[] insertionSort(int nums[]) {
		
		for (int i = 1 ; i < nums.length ; i++) {  // we set i at 1 so we can compare 0 using j
			int current = nums[i];
			int last = i - 1;
			
			
			while (last >= 0 && nums[last] > current) {  // [ last | current ]
				System.out.println("Switching " + nums[i] + " and " + nums[last]);
				nums[last + 1] = nums[last]; // this is our swap out that will m		ove our numbers in order backward
				last = last - 1; // this will continue to decrement our number until it is -1 to break it out
			}
			nums[last + 1] = current;
			
			System.out.println("Current array: ");
			
			for (int n : nums) System.out.print(n + " ");
			System.out.println();

			
		}
		return nums;
		
	}
	public static void main(String args[]) { 
		
		int test[] = { 4, 2, 5, 3, 8, 11, 7, 1 };
		// our sort method should return it as 1, 2, 3, 4, 5, 7, 8, 11 
		for (int t : test) System.out.print(t + " ");
		System.out.println();
		int[] sorted = insertionSort(test);
		System.out.println("Testing insertion sort method: ");
		
		
		for (int s : sorted) System.out.print(s + " ");
		System.out.println();

		
	}
}
