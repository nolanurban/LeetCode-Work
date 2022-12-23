import java.util.HashMap;

public class RemoveDuplicate {

	public static int removeDuplicates(int[] nums) {
        // if we're dealing with removing duplicates, why not create a hashmap that we can go ahead and iterate through
        // into a new return array?

        HashMap<Integer, Integer> storage = new HashMap<>(); // we'll store the entire thing and then iterate through

        // populate the map.
        for (int i = 0 ; i < nums.length ; i++) {
            storage.put(nums[i], i); 
            nums[i] = '_';        }
            // i will be the index of our array
        
        System.out.println(storage);
        return storage.size();
    }


	public static void main(String args[]) {
		
		int[] testArray = { 1, 1, 2 };
		
		System.out.println(removeDuplicates(testArray));
	}

}
