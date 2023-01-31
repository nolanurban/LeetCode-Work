
public class Scores100 {
	public static boolean scores100(int[] scores) {
		  // looking for any two continous scores of a 100;
		  for (int i = 0 ; i < scores.length ; i++) {
		    if (scores[i] == 100) {
		      if ((i + 1) <= scores.length-1 && scores[i+1] == 100) return true;
		      else continue;
		    }
		  } 
		 return false;
		}
	public static void main(String args[]) {
		int[] scores = { 1, 1, 3, 5, 100, 100, 1, 200 };
		System.out.println("Testing scores array, should return true: " + scores100(scores));
		int[] scores2 = { 1, 1, 3, 5, 100, 9, 100, 1, 200 };
		System.out.println("Testing scores2 array, should return false: " + scores100(scores2));
		
		
	}
}
