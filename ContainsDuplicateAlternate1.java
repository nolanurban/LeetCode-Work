import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicateAlternate1 {
	   public static boolean containsDuplicate(int[] nums) {
		   Set<Integer> ourSet = new HashSet<>();
		   for (int n : nums) ourSet.add(n);
		   
		   return (ourSet.size() != nums.length);
	    }
	    public static void main(String args[]) {
	    	
	    	int[] test = { 1, 2, 3, 1 };
	    	
	    	System.out.println("Testing if it contains duplicate, should return true: " + containsDuplicate(test));
	    	
	    }
}
