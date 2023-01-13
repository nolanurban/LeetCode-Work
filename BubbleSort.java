/* working on sorting algorithms complete with print outs for my own edification
 * 
 * sort the array left to right
 * i vs i + 1
 * 
 * if i > i + 1
 * swap
 * 
 * temp = i;
 * i = i + 1;
 * i + 1 = temp;
 * 
 * lessons learned: it's pretty inefficient O(n^2) but obviously it works.  
 */
public class BubbleSort {

	
	public static int[] bubbleSort(int[] input) {
		
		for (int j = 0 ; j < input.length ; j++) {
			for (int i = 0 ; i < input.length-1 ; i++) {
				System.out.println("Checking input[" + i + "]: " + input[i] + " and input[" + (i+1) + "]: " + input[i+1]);
				if (input[i] > input[i+1]) {
					System.out.println("Swapping " + input[i] + " and " + input[i+1]);
					int temp = input[i]; // place hold
					input[i] = input[i+1];
					input[i+1] = temp;
				}
				
			}
		}
		return input;
	}
	public static void main(String args[]) {
		
		int[] testArray = { 2, 5, 3, 8, 4, 1, 9 };

		System.out.println("Original");
		for (int t : testArray) System.out.print(t + " ");
		System.out.println();
		int[] newArray = bubbleSort(testArray);
		System.out.println("Final: ");
		for (int n : newArray) System.out.print(n + " ");
		System.out.println();
	}
}
 