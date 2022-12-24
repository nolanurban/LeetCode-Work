import java.util.ArrayList;
import java.util.List;

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
	            for (int i = 0 ; i < n-1 ; i++) {
	                for (int j = 0 ; j < n-1 ; j++) {
	                    if (ar.get(i) > ar.get(j)) {
	                        if ((ar.get(i) / ar.get(j)) % k == 0) {
	                            returnInt++;
	                        }
	                    }
	                }
	        
	            }

	        return returnInt;
	        }
	
	
	
	public static void main(String args[]) {
		List<Integer> testArray = new ArrayList<>();
		testArray.add(1); 
		testArray.add(3);
		testArray.add(2); 
		testArray.add(6);
		testArray.add(1); 
		testArray.add(2);
		System.out.println(divisibleSumPairs(6, 3, testArray));
	}
}
