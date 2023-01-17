import java.util.HashSet;
import java.util.Set;

public class pangrams {
	   public static String pangrams(String s) {
		    // Write your code here
		    Set<Character> alphabet = new HashSet<>();
		    
		    char c[] = s.toLowerCase().toCharArray();
		    
		    for (char check : c ) {
		        int checkValue = (int) check;
		        if (checkValue > 96 && checkValue < 123) 
		            alphabet.add(check);
		    } 
		    if (alphabet.size() == 26) return "pangram";
		    else return "not pangram";

		    }

	   public static void main(String args[]) {
		   String test = "We promptly judged antique ivory buckles for the next prize";
		   System.out.println("Testing, should return pangram: " + pangrams(test));
	   }
}
