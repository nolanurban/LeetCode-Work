
public class Fix34 {
	public static int[] fix34(int[] nums) {
		  int find3 = 0;
		  int find4 = 0;
		  
		  for (int i = 0 ; i < nums.length ; i++) {
			  if (nums[i] == 3) {
				  for (int j = i ; j < nums.length ; j++) {
					  if (nums[j] == 4) {
						  int temp = nums[i+1];
						  nums[i+1] = 4;
						  nums[j] = temp;
					  }
				  }
			  }
		  }	
		  return nums;
	}

	public static void main(String args[]) {
		int[] arr1 = { 1, 3, 1, 4 };
		int[] arr2 = { 1, 3, 1, 4, 4, 3, 1 };
		
		int[] result1 = fix34(arr1);
		int[] result2 = fix34(arr2);
		
		System.out.println("Fixing arr1: ");
		for (int n : arr1) System.out.print(n + " ");
		System.out.println();
		System.out.println("Fixing arr2: ");
		for (int n : arr2) System.out.print(n + " ");
		System.out.println();
		
	}
}
