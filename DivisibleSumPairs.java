import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 	Given an array of integers and a positive integer , determine the number of  pairs where  and  +  is divisible by .
	Example
	Three pairs meet the criteria:  and .
	Function Description
	Complete the divisibleSumPairs function in the editor below.
	divisibleSumPairs has the following parameter(s):
	int n: the length of array
	int ar[n]: an array of integers
	int k: the integer divisor
	Returns
	- int: the number of pairs
	Input Format
	The first line contains  space-separated integers,  and .
	The second line contains  space-separated integers, each a value of .
	
	
	Test case should return 5
 */

public class DivisibleSumPairs {

	  public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
	         int returnInt = 0;
	            for (int i = 0 ; i < n ; i++) {
	                for (int j = 0 ; j < n ; j++) {
	                    if (i < j) {
	                    	int sum = 0;
	                    	sum = ar.get(i) + ar.get(j);
	                    	if (sum % k == 0) {
//	                        if ((ar.get(i) + ar.get(j)) % k == 0) {
	                        	returnInt++;
	                        }
	                    }
	                }
	        
	            }

	        return returnInt;
	        }
	
	
	
	public static void main(String args[]) {
		
		String testString = "43 95 51 55 40 86 65 81 51 20 47 50 65 53 23 78 75 75 47 73 25 27 14 8 26 58 95 28 3 23 48 69 26 3 73 52 34 7 40 33 56 98 71 29 70 71 28 12 18 49 19 25 2 18 15 41 51 42 46 19 98 56 54 98 72 25 16 49 34 99 48 93 64 44 50 91 44 17 63 27 3 65 75 19 68 30 43 37 72 54 82 92 37 52 72 62 3 88 82 71";
		String converted[] = testString.split(" ");
		int convertedAgain[] = Arrays.stream(converted).mapToInt(Integer::parseInt).toArray();
		List<Integer> testArray = Arrays.stream(convertedAgain).boxed().collect(Collectors.toList());


		System.out.println("Success is: 216 return pairs -- " + divisibleSumPairs(100, 22, testArray) + " pairs");
	}
}
