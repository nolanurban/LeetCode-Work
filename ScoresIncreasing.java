
public class ScoresIncreasing {
		public static boolean scoresIncreasing(int[] scores) {
	
			int last = scores[0];
			
			for (int i = 0 ; i < scores.length ;i++) {
				if (last > scores[i]) return false;
				last = scores[i];
			}
			return true;
		}
	public static void main(String args[]) {
		int[] test = { 1, 3, 4, 5, 12, 9};
		
		System.out.println("Testing test, should return true: " + scoresIncreasing(test));
	}

}
