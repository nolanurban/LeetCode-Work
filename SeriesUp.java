
public class SeriesUp {

	public static int[] seriesUp(int n) {
		int result[] = new int[n * (n + 1) / 2];
		
		int lastIndex = 0; // this will move us progressively down the resultarray

		for (int j = 1 ; j <= n ; j++) {  // this will iterate us towards n to kill our loop
			for (int k = 1 ; k <= j ; k++) { // this fills in 1, then 1, 2, then 1,2,3 as j loop moves slowly towards n
				result[lastIndex++] = k;
			}
			// inner loop mov 
		}
	
		return result;
	}
	
	public static void main(String args[]) {
		
		
		int test[] = seriesUp(3);
		System.out.println("Testing, should return an array thats ascending: ");
		for (int t : test) System.out.print(t + " ");
		System.out.println();
		
		
	}
}
 