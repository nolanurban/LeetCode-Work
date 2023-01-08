import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/*
 * So this one wasn't too bad but I tried to do too much causing a overly complicated solution.  At first I thought I would need
 * a series of nested loops in order to check each and every spot.  It turns out, as I have it, all I needed to do was a single loop
 * and do a series of hand off local integer variables to hold values and pass them into our array list.
 * 
 * 
 * 
 * 
 */
public class CountingSort {
	 public static List<Integer> countingSort(List<Integer> arr) {
		    // Write your code here
		    // create an array full of zeroes, I was able to do this in the first loop, and complete the search method in the nested loop.  It's interesting you can't use a standard ++ iterator within the set.
		    List<Integer> returnArray = IntStream.generate(() -> 0).limit(100).boxed().collect(Collectors.toList());
		    // this is really cool ^^
		        for (int i = 0 ; i < arr.size() ; i++) {
		            int value = arr.get(i); // this is the value of position i
		            int increase = returnArray.get(value); // in the beginning this may be zero
		            returnArray.set(value, increase + 1);
		        }    
		    return returnArray;
		    }
	 public static void main(String args[]) {
		 List<Integer> testList = new ArrayList<>(Arrays.asList(1, 1, 2,2, 3, 4, 5));
		 
		 System.out.println(countingSort(testList));
	 }
}
