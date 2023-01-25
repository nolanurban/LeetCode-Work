import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
	public static String longestPalindrome(String s) {
		int i = s.length() / 2;
		int left = i - 1, right = i + 1;
		char[] cArray = s.toCharArray();
		String returnString = "";
		returnString += s.charAt(i);

		while (left >= 0 && right <= s.length()) {
			if (cArray[left] == cArray[right]) {
				returnString = s.substring(left, right + 1);
				// probably need a hand off temp string
				left--; // move our pointers
				right++;
			} else
				break;

		}
		return returnString;
	}

	public static String longestPalindromeSb(String s) {
		// same method utilizing left and right pointers, but entry begins at start
		String returnString = "";
		
		if (s.length() == 1) return s;
		
		for (int left = 0; left < s.length(); left++) {
			for (int right = left; right < s.length(); right++) {
				String checkString = s.substring(left, right + 1);
				StringBuilder sb = new StringBuilder(checkString);
				String reversed = sb.reverse().toString();
				System.out.println("Checking " + checkString + " against " + reversed);
				if (checkString.equals(reversed) && checkString.length() > returnString.length())
					returnString = checkString;
			}

		}
		return returnString;
	}
	public static String longestPalindromeSbAltered(String s) {
		// same method utilizing left and right pointers, but entry begins at start
		String returnString = "";
		
		if (s.length() == 1) return s;
		for (int left = 0; left < s.length(); left++) {
			int right = s.length();
//			for (int right = s.length(); right > left; right--) {
//			System.out.println(right - left);
			if ((right - left) < returnString.length()) {
				System.out.println("No possible matches with a greater length palindrome, exiting");
				break;
			}
			while (right > left) {
				String checkString = s.substring(left, right);
				String reversed = new StringBuilder(checkString).reverse().toString();
//				System.out.println("Checking " + checkString + " against " + reversed);
//				if (checkString.length() < returnString.length()) {
//					System.out.println("Found palindrome larger");
//					return returnString;
//				}
				right--;
				if (reversed.charAt(0) != checkString.charAt(0)) { 
//					System.out.println("Skipping");
					continue;
				}
				if (checkString.equals(reversed) && checkString.length() > returnString.length()) {
					returnString = checkString;
//					System.out.println("**** palindrome: " + checkString);
					break;
				}
			}
			right = s.length();

		}
		return returnString;
	}

	public static void main(String args[]) {

		String test = "twbiqwtafgjbtolwprpdnymaatlbuacrmzzwhkpvuwdtyfjsbsqxrlxxtqkjlpkvpxmlajdmnyepsmczmmfdtjfbyybotpoebilayqzvqztqgddpcgpelwmriwmoeeilpetbxoyktizwcqeeivzgxacuotnlzutdowiudwuqnghjgoeyojikjhlmcsrctvnahnoapmkcrqmwixpbtirkasbyajenknuccojooxfwdeflmxoueasvuovcayisflogtpxtbvcxfmydjupwihnxlpuxxcclbhvutvvshcaikuedhyuksbwwjsnssizoedjkbybwndxpkwcdxaexagazztuiuxphxcedqstahmevkwlayktrubjypzpaiwexkwbxcrqhkpqevhxbyipkmlqmmmogrnexsztsbkvebjgybrolttvnidnntpgvsawgaobycfaaviljsvyuaanguhohsepbthgjyqkicyaxkytshqmtxhilcjxdpcbmvnpippdrpggyohwyswuydyrhczlxyyzregpvxyfwpzvmjuukswcgpenygmnfwdlryobeginxwqjhxtmbpnccwdaylhvtkgjpeyydkxcqarkwvrmwbxeetmhyoudfuuwxcviabkqyhrvxbjmqcqgjjepmalyppymatylhdrazxytixtwwqqqlrcusxyxzymrnryyernrxbgrphsioxrxhmxwzsytmhnosnrpwtphaunprdtbpwapgjjqcnykgspjsxslxztfsuflijbeebwyyowjzpsbjcdabxmxhtweppffglvhfloprfavduzbgkw";
		System.out.println("Result: " + longestPalindromeSbAltered(test));

	}
}