/*
 * This particular one gave me fits because of a wrapper type issue.  The integers used
 * for the test cases were just large enough to not throw an error (of course) but rather
 * loop back around to the other side of the Integer class.  Fixed with a Long.
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {

	public static void miniMaxSum(List<Integer> arr) {

		arr = arr.stream().sorted().collect(Collectors.toList());
		System.out.println(arr);
		List<Integer> minList = arr.stream().sorted().collect(Collectors.toList());
		minList.remove(0);

		for (Integer i : minList)
			System.out.print(i + " ");
		
		System.out.println();

		Long minListSum = minList.stream().collect(Collectors.summingLong(Integer::intValue));
		List<Integer> maxList = arr.stream().sorted().collect(Collectors.toList());
		maxList.remove(maxList.size() - 1);
		for (Integer i : maxList)
			System.out.print(i + " ");
		System.out.println();

		Long maxListSum = maxList.stream().collect(Collectors.summingLong(Integer::intValue));

		System.out.println(maxListSum + " " + minListSum);

	}
	
	public static void main(String args[]) {
		
		List<Integer> arr = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);
		miniMaxSum(arr);
		System.out.println((long)(467905213 + 623958417 + 714532089 + 938071625));

	}

}
 