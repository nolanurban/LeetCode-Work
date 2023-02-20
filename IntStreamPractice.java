import java.util.stream.IntStream;

public class IntStreamPractice {
	
	private static int doublePrint(int n) {
		return n * 2;
	}

	public static void main(String args[]) {
		
		// lets work with an integer stream.
		
		IntStream.range(1, 25).forEach(n -> System.out.println("Our number: " + doublePrint(n)));
	}
}
