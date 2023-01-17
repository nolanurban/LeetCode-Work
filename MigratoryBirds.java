import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
	
    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    Map<Integer, Integer> birdMap = new HashMap<>();
    
    for (int i = 0 ; i < arr.size() ; i++) {
        
        if (birdMap.containsKey(arr.get(i))) {
            int value = birdMap.get(arr.get(i));
            value++;
            birdMap.replace(arr.get(i), value);
        }
        else
        birdMap.put(arr.get(i), 1); // all birds get a default value of 1.
    }
    int biggestValue = (Collections.max(birdMap.values()));
        for (Map.Entry<Integer, Integer> entry : birdMap.entrySet()) {
            if (biggestValue == entry.getValue()) 
                return entry.getKey();
        }
    return 0;
    }
    
    public static void main(String args[]) {
    	List<Integer> testArr = Arrays.asList(1, 2, 3, 3, 3, 4);
    	System.out.println("This should return a 3 : " + migratoryBirds(testArr));
    	
    	
    }
} 
