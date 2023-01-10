/*
 * So, in this particular HR challenge, you had to take a sentence and determine each object as a string, integer, or double.
 * 
 * 
 * I was only able to pass three cases with no real indication of where it was failing.  The code certainly does work.
 * 
 */


public class TypeCount {

	public static void typeCounter(String sentence) {
		int sCount = 0, iCount = 0, dCount = 0;
		
		String sArr[] = sentence.split(" ");
		
		for (String s : sArr) {
			sCount++;
			try {
				Integer a = Integer.parseInt(s);
				iCount++;
				sCount--;
				continue;
			} catch (NumberFormatException e) { 

			}
			try {
				Float d = Float.parseFloat(s);
				System.out.println(d + " is a double");
				dCount++;
				sCount--;

			} catch (NumberFormatException e) { 

			}
			

			
		}
		System.out.println("string " + sCount);
		System.out.println("integer " + iCount);
		System.out.println("double " + dCount);
	}
	
	public static void main(String args[]) {
		String sentence = "128792089.645010898";
		typeCounter(sentence);
	}
}
