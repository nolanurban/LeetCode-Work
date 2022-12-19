
public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		
		int prefixLength = 1;
		String prefix = strs[0].substring(0, prefixLength);
		String returnPrefix = "";
		
		while (prefixLength <= strs[0].length()) {
			for(String s : strs) {
				System.out.println("Checking " + s + " for prefix: " + prefix);
				if (!s.contains(prefix)) {
				returnPrefix = prefix;	
				return returnPrefix;
				}
			}
			prefixLength++;
			prefix = strs[0].substring(0, prefixLength);
		}
		return returnPrefix;
		
	}
	
	public static void main(String args[]) {
		
		
		String testArray[] = { "a", "a", "a" };
		
		System.out.println("Longest common prefix is: " + longestCommonPrefix(testArray));
		
	}
}
