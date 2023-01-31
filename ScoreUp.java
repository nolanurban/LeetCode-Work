
public class ScoreUp {
	public static int scoreUp(String[] key, String[] answers) {

		  int totalScore = 0;
		  for (int i = 0 ; i < key.length ; i++)  {
		  
		  if (answers[i].equals("?")) continue;
		  
		  else if (answers[i].equals(key[i])) totalScore += 4;
		  else totalScore += -1;

		  }
		    
		    return totalScore;
		    
		}
	public static void main(String args[]) {
		String key[] = { "a", "a", "b", "b" };
		String answers[] = { "a", "c", "b", "c" };
		
		System.out.println("Checking scores, should return a 6: " + scoreUp(key, answers));
	}
}
