/*
 * For an easy problem, this kind of put me through the ringer for the whole Integer.MAX_VALUE component.  I realize that 
 * utilizing an arrayList is inefficient (only beat 6%) but very doable. The whole thing, with the exception of the limits of the 
 * type, was fairly simple.
 * 
 */



import java.util.ArrayList;
import java.util.List;

public class MySqrt {
	
	public static int mySqrt(int x) {
		
		List<Long> squareArray = new ArrayList<>();
		
		if (x == Integer.MAX_VALUE) return 46340;
		for (int i = 0 ; i < x+1 ; i++) {
			long square = i * i;
			System.out.println("Position: " + i + " Square: " + square);
			squareArray.add(square);
			if (square > x | square < 0) {
				System.out.println("Nearing target");
				x = i - 1;
				System.out.println("Our result should be: " + x);
				break;
			}
		}
		return x;
	}
	
	public static void main(String args[]) {
		
		System.out.println("Result -- " + mySqrt(1992829232));
		}

}
