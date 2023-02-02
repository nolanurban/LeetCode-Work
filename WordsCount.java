public class WordsCount {
	public static int wordsCount(String[] words, int len) {
		  // advanced loop through, use a counter, return count.
		  
		  int count = 0;
		  for (String w : words) {
		    if (w.length() == len) count++;
		  }
		  return count;
		}
	public static void main(String args[]) {
		
		String words[] = { "a", "bb", "b", "ccc" };
		
		System.out.println("Checking for words with a count of 2, should return 1: " + wordsCount(words, 2));
	}
}
