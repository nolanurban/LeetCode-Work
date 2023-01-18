
public class AppendAndDelete {
	public static String appendAndDelete(String s, String t, int k) {
		// Write your code here
		String shortWord = "", longWord = "";
		if (s.length() + t.length() < k)
			return "Yes";
		// check for the differing letters of each, the length of that must be less than
		// k
		if (s.length() > t.length()) {
			shortWord = t;
			longWord = s;
		} else {
			shortWord = s;
			longWord = t;
		}


		int i = 0;
		while (i < shortWord.length()) {
			if (shortWord.charAt(i) != longWord.charAt(i)) {
				break;
			}
			i++;
		}

		if (shortWord.length() + (longWord.length() - i) <= k)
			return "Yes";
		else
			return "No";
	}

	public static void main(String args[]) {
		String s = "abcd";
		String t = "abcdert";

		System.out.println(appendAndDelete(s, t, 10));

	}
}
