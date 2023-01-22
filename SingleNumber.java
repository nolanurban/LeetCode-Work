import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        int value = 0;
        Map<Integer, Integer> check = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++) {
            int current = nums[i];    
            if (check.containsKey(current)) {
                value = check.get(current);
                value++;
                check.replace(current, value);
            }
            else
            check.put(nums[i], 1);
        }
        for (int c : check.keySet())
            if (check.get(c) == 1) return c;
        
        return 0;
    }
    public static void main(String args[]) {
    	
    	int nums[] = { 3, 3, 5, 5, 2, 2, 1 };
    	
    	System.out.println("Checking for a non repeat number in test set: " + singleNumber(nums));
    }
}
