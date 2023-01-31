
public class WordsWithout {
	public static String[] wordsWithout(String[] words, String target) {
		  String result = "";
		  for (String s : words) {
		    if (s.equals(target)) continue;
			    result += s;
			    result += ",";

		  }
		  String sArrResult[] = result.split(",");
		  return sArrResult;
		}
	public static void main(String args[]) {
		String[] phrase = { "a", "b", "c", "a" };
		String[] returnPhrase = wordsWithout(phrase, "a");
		System.out.println("Checking phrase, returning without \" a \" ");
		for (String w : returnPhrase) System.out.print(w + " ");
		System.out.println();
		
	}

}
