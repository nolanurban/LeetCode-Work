
public class PlusOne {

	public static int[] plusOne(int[] digits) {
		
		Long actualNumber = 0l;
		for (int i = 0 ; i < digits.length ; i++) {
			actualNumber = actualNumber * 10 + digits[i];
		}
		actualNumber++;
		System.out.println(actualNumber);
		int length = (int)(Math.log10(actualNumber) + 1);
		int[] returnIntArray = new int[length];
	
		for (int i = length-1 ; i >= 0 ; i--) {
			returnIntArray[i] = (int) (actualNumber % 10);  // we have to do this in reverse.
			actualNumber /= 10;
		}
		return returnIntArray;
	}

	public static void main(String args[]) {
		
		int[] testIntArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		
		int check[] = plusOne(testIntArray);
		
		System.out.println("CHECKING");
		for(int i : check) 
			System.out.println(i);
		
		
	}
}
