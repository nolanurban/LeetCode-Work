import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Given an array of integers arr, return true if the number of occurrences of each 
 * value in the array is unique or false otherwise. Beats 78%
 *
 */
public class UniqueNumberOfOccurences {
    public static boolean uniqueOccurrences(int[] arr) {
        
    	Map<Integer, Integer> checkMap = new HashMap<>();
    	// place all into a hashmap
    	for (int a : arr) {
    		if (checkMap.containsKey(a)) {
    			int value = checkMap.get(a);
    			value++;
    			checkMap.replace(a, value);
    		}
    		else
    			checkMap.put(a, 1);
    	}
    	System.out.println(checkMap);
    	System.out.println(checkMap.size());

    	
    	Set<Integer> checkSet = new HashSet<>();
    	// we create a hashset so we can enter values.
    	for (Map.Entry<Integer, Integer> entry :  checkMap.entrySet())
    		checkSet.add(entry.getValue());
    	// utilize the entry set to put values into the set, which will eliminate any duplicates
    	
    	System.out.println(checkSet);
    	
    	return (checkMap.size() == checkSet.size()); 
    	// if all the values are unique, they'll exist within the set and sizes should be same.
    }
    public static void main(String args[]) {
    	
    	int[] test = { 1, 1, 1, 2, 2, 3, 4, 4, 4 };
    	System.out.println("Are all the instances of the array unique? " + uniqueOccurrences(test));    	
    }
}
