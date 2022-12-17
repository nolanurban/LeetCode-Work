/* Not LeetCode or anything else, just a playground for recursion */
public class RecursiveBasics {

	public static void printFun(int input) {
		
		// lets do a check on the input
		if (input < 1) {
			return; // this is our recursive loop break; OUR BASE CASE
			
		}
		
		else {
			System.out.println("our input: " + input);
			printFun(input - 1); // take one away from our input until we can hit 0.
			System.out.println("our input post function: " + input);
			return;
		}
		
	}
	
	public static int fibonacciSequence(int n) {
		
		// establish a base case
		
		if (n ==0) return 0; // user catch for 0
		
		if (n == 1 || n == 2) {
			return 1;  // our base case for fibonacci sequence 1 & 2 return a 1.
		}
		int x = fibonacciSequence(n -1);
		int y = fibonacciSequence(n-2);
		System.out.println("Our equation: " + x + " + " + y + " = " + (x+y));
		return x+y;
	
		
	}

	public static void main(String args[]) {
		int testNumber = 42;
		
//		printFun(testNumber); // lets test our recursion.
		
		System.out.println(fibonacciSequence(7));
	}
	
}
