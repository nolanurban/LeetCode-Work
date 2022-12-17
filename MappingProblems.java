import java.util.HashMap;
import java.util.Map;

// This is from CodingBat, another prep website
// working with Maps / hash maps specifically.
public class MappingProblems {

	
	public static Map<String, Integer> word0(String[] strings) {
		  Map<String, Integer> returnMap = new HashMap<>(); // our return map 
		  
		  // we should use a for object loop to populate our map.  each key should be unique but values remain 0
		  
		  for (String s : strings) {
		    returnMap.put(s, 0);
		  }
		  return returnMap;
	}
	public static void main(String args[]) {
		String[] testStringArray = { "Billy", "Bobby", "Browns", "Borrish" };
	
		Map<String, Integer> testMap = word0(testStringArray);
		
		System.out.println(testMap);
		
		
	}
	
}
