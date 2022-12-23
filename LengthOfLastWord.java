/*
 * Super easy program, did mess up from  not reading the directions and found the longest word
 * and returned that instead.  Program just wants to know last word.
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        // break it into an array, find the longest array, oops, we need the last word not the longest word. silly me.
        if (s.isEmpty()) return 0;

        String sArray[] = s.split(" ");
        return sArray[sArray.length-1].length();
    }
    
    public static void main(String args[]) {
    	String testPhrase = "I am a meat popsicle";
    	
    	System.out.println("Conducting test, should return integer of 8 : " + lengthOfLastWord(testPhrase));
    }
    
}
