
public class TruncateSentence {
	 public static String truncateSentence(String s, int k) {
	        
	        String[] sArray = s.split(" ");
	        String r = "";
	        for (int i = 0 ; i < k ; i++) 
	            r += sArray[i] + " ";

	        r = r.substring(0, r.length()-1);
	        return r;
	    }   
	 public static void main(String args[]) {
		 String testPhrase = "I am a meat popiscle";
		 
		 System.out.println(truncateSentence(testPhrase, 4));
	 }
}
