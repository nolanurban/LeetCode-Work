import java.util.HashMap;
import java.util.Map;

/* 
 * Modify and return the given map as follows: 
 * for this problem the map may or may not contain the "a" and "b" keys. 
 * If both keys are present, append their 2 string values together and store the result under the key "ab".
 */
public class MapAB {

	public static Map<String, String> mapAB(Map<String, String> map) { 
		
		if (map.containsKey("a") && map.containsKey("b")) {
			String entryAB = map.get("a") + map.get("b");			
			map.put("ab", entryAB);
		}
		else return map;
		
		
		
		return map;
	}
	public static void main(String args[]) {
		
		Map<String, String> testMap = new HashMap<>();
		
		testMap.put("a", "Hi");
		testMap.put("b", "There");
		
		System.out.println("Output before function: " + testMap);
		System.out.println("Output after function: " + mapAB(testMap));
		testMap.remove("b");
		testMap.remove("ab");
		System.out.println("Output after function: " + mapAB(testMap));

	}
	
}
 


