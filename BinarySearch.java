// an efficient way to work through a sorted array.  it splits the array in half, looks at the middle.
// 1 2 4 5 7 9 11 target 9
// middle would be 5
// eliminate 1 2 4
// new array 5 7 9 11, middle becomes left
// middle is 7
// 5 discarded
// 7 left 
// 7 9 11
// take middle 9 --  
public class BinarySearch {

	
	private static int binarySearch(int num[], int target) {
		
		int leftPointer = 0 ; 
		int rightPointer = num.length-1;
		
		while (leftPointer <= rightPointer) {
			int middlePosition = (leftPointer + rightPointer) / 2;
			int middleNumber = num[middlePosition];
			
			if (target == middleNumber) { // found it
				return middlePosition; 
			}
			if (target < middleNumber) {
				rightPointer = middlePosition - 1; // moves right to the middlePosition minus 1
				
			} else leftPointer = middlePosition + 1;
			
		}
		
		
		return -1; // this means not found.
	}
	
	public static void main(String args[]) {
		//                 0  1  2  3  4  5  6   7   8   9
		int numArray[] = { 1, 2, 3, 5, 6, 7, 8, 11, 13, 19 };
		
		int found = binarySearch(numArray, 13);
		
		if (found < 0) System.out.println("Target number not found");
		else System.out.println("Target found at index position: " + found);
		}
	
}
