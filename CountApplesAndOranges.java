import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountApplesAndOranges {
	   /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s -- starting point
     *  2. INTEGER t -- ending point
     *  3. INTEGER a. --- apple tree (on the left of the house)
     *  4. INTEGER b --- orange tree (on the right of the house)
     *  5. INTEGER_ARRAY apples -- coordinates on a number line where the apples fell
     *  6. INTEGER_ARRAY oranges -- coordinates on the number line where the oranges fell
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        
        int aCount = 0; // lets total our fruit
        int oCount = 0; 

        // I forgot to account for the tree position
        // lets get the apple count
        
        for (Integer apple : apples) {
            int distanceCheck = a + apple;
            if (distanceCheck >= s && distanceCheck <= t) aCount++;
        }
        // lets get the orange count
        for (Integer orange : oranges) {
            int distanceCheck = b + orange;
            if (distanceCheck >= s && distanceCheck <= t) oCount++;
        }
        // now lets out put on two lines
        System.out.println(aCount);
        System.out.println(oCount);
    }
    
    public static void main(String args[]) {
    	int s = 7, t = 11; // house coordinates
    	int a = 5, b = 15;
    	List<Integer> apples = new ArrayList<>(Arrays.asList(-2, 2, 1));
    	List<Integer> oranges = new ArrayList<>(Arrays.asList(5, -6));
    	
    	System.out.println("Count should return a 1 and 1 from inputs: ");
    	countApplesAndOranges(s,t,a,b,apples,oranges);
    	
    }

}
