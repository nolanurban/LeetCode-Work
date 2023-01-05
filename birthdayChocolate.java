import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

Example



Lily wants to find segments summing to Ron's birth day,  with a length equalling his birth month, . In this case, there are two segments meeting her criteria:  and .
 */
public class birthdayChocolate {
	
    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    	int matchCount = 0;
    	
    	if (s.size() < m) return 0;
    	System.out.println(s.size());
    	if (s.size() == 1) {
    		if (s.get(0) == d) return 1;
    	}
    	
    	for (int i = 0 ; i < s.size()-(m-1) ; i++) { // I had to make two changes first, subtract 1, then subtract m -- ridiculous.
    		int sumVar = 0; // this is to check against d
    		for (int j = i ; j < i + m ; j++) {
    			System.out.println("Testing at: " + j + " Value of " + s.get(j));
    			sumVar += s.get(j);
    		}
    		if (sumVar == d) {
    			System.out.println("Match");
    			matchCount++;
    		}
    	}

    	return matchCount;
    }
    
    public static void main(String args[]) {
    	
    	List<Integer> testList = new ArrayList<>(Arrays.asList(3, 5, 4, 1, 2, 5, 3, 4, 3, 2, 1, 1, 2, 4, 2, 3, 4, 5, 3, 1, 2, 5, 4, 5, 4, 1, 1, 5, 3, 1, 4, 5, 2, 3, 2, 5, 2, 5, 2, 2, 1, 5, 3, 2, 5, 1, 2, 4, 3, 1, 5, 1, 3, 3, 5));
    	int d = 18; // the day of the birth = sum of digits from array
    	int m = 6; // the month of birth = length of array
    	
    	System.out.println("This should print out the number of matches to our stipulations: " + birthday(testList, d, m));
    }

}
