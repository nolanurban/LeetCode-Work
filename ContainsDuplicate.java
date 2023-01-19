import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        List<Integer> newList = Arrays.stream(nums).boxed().toList();
        Set<Integer> ourSet = new HashSet<>(newList);
        
        
        if (ourSet.size() < nums.length) return true;
        else return false;


    }
    public static void main(String args[]) {
    	
    	int[] test = { 1, 2, 3, 1 };
    	
    	System.out.println("Testing if it contains duplicate, should return true: " + containsDuplicate(test));
    	
    }
}
