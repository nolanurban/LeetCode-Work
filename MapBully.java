import java.util.HashMap;
import java.util.Map;

/*
 * Modify and return the given map as follows: if the key "a" has a value, 
 * set the key "b" to have that value, and set the key "a" to have the value "". 
 * Basically "b" is a bully, taking the value and replacing it with the empty string.
 */
public class MapBully {
	public static Map<String, String> mapBully(Map<String, String> map) {
			// had to redo this because one test case didn't actually have a b key/value pair and it requires its creation.  put can also replace.
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.replace("a", "");
		}

		return map;
	}
	

	public static void main(String args[]) {
		
		Map<String, String> testMap = new HashMap<>();
		
		testMap.put("a",  "candy");
		testMap.put("b", "dirt");
		
		System.out.println("Old Map: " + testMap);
		System.out.println("New Map: " + mapBully(testMap));
	
	}
}
