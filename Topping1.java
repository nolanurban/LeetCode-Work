import java.util.HashMap;
import java.util.Map;

/*
Given a map of food keys and topping values, 
modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". 
In all cases, set the key "bread" to have the value "butter".
*/

/* 
 * Given a map of food keys and their topping values, 
 * modify and return the map as follows: if the key "ice cream" has a value, 
 * set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".
 */
public class Topping1 {
	
	public static Map<String, String> topping1(Map<String, String> map) {
	
		if (map.containsKey("ice cream")) {
			map.put("ice cream", "cherry");
		}
		map.put("bread", "butter");
		return map;
	}
	public static Map<String, String> topping2(Map<String, String> map) {
		
		if (map.containsKey("ice cream")) {
			map.put("yogurt", map.get("ice cream"));
		}
		if (map.containsKey("spinach")) {
			map.put("spinach", "nuts");
		}
		return map;
	}

	
	public static void main(String args[]) {
		
		Map<String, String> testMap = new HashMap<>();
		
		
		System.out.println("Output before function: " + testMap); 
		System.out.println("Output after function: " + topping1(testMap));
		testMap.put("ice cream", "cherry");
		testMap.put("spinach", "delicious");
		System.out.println("Output before function: " + testMap); 
		System.out.println("Output after function: " + topping2(testMap));
		
	}
}
 