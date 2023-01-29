
public class SumHeight {

	public static int sumHeights(int[] heights, int start, int end) {
		
		int dSum = 0;
		for (int i = start ; i < end ; i++) {
			dSum += Math.abs(heights[i] - heights[i+1]);
			System.out.println(dSum);
		}
		return dSum;
		
	}
	
	public static int sumHeightsRecursive(int[] heights, int start, int end) {
//		int total = Math.abs(heights[start] - heights[start + 1]);
		if (start >= end) return 0;
		return Math.abs(heights[start] - heights[start + 1]) + sumHeightsRecursive(heights, start+1, end);
	}
	
	public static void main(String args[]) {
		int test[] = { 5, 3, 6, 7, 2 };
		int start = 0;
		int end = 4;
		
		System.out.println("Checking altitude heights between indexes " + start + " and " + end + " : " + sumHeightsRecursive(test, start, end));
		
	}
}
