/*
 * "WHEN IN DOUBT, USE A HASHMAP"
 * 
 * 
 * I did three different versions with iterations etc and this problem is mostly about 
 * correct placement of conditionals.  Taking the time to think it through and whiteboard it
 * really made a difference.
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		
		List<String> abc = new ArrayList<>();
		List<String> sList = Arrays.asList(strs);
		String smallest = sList.stream().min(Comparator.comparingInt(String::length)).get();
		char charArray[] = smallest.toCharArray();
		Map<Integer, Character> hMap = new HashMap<>();
		String returnList = "";
		
		for (int i = 0 ; i < charArray.length ; i++) 
			hMap.put(i, charArray[i]);
		
		for (int i = 0; i < charArray.length ; i++) {
			for (int j = 0 ; j < strs.length ; j++) {
				if (sList.get(j).length() <= i) 
					return returnList;
				if (sList.get(j).charAt(i) != hMap.get(i))
					return returnList;
			}
			returnList += hMap.get(i);
		}
		
			
		return returnList;
	}
	
	public static void main(String args[]) {
		
		
		String testArray[] = { "aca", "def" };
		
		System.out.println("Longest common prefix is: " + longestCommonPrefix(testArray));
		
	}
}
