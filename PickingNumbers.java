import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
        int count = 0;
        int largestSet = 0;
        Collections.sort(a);
        
        for (int i = 0 ; i < a.size() ; i++) {
            for (int j = i+1 ; j < a.size() ; j++) {
                int check = Math.abs(a.get(i)-a.get(j));
                if (check <= 1) {
                    count++;
                }
            }
            if (count > largestSet) largestSet = count;
            count = 0;
        }
        return largestSet + 1;
    }
    public static void main(String args[]) {
    	
    	List<Integer> testList = Arrays.asList(2, 2, 1, 1, 2, 3);
    	System.out.println("Test here should be 5: " + pickingNumbers(testList));
    	
    	
    }
}
