
public class HasOne {
	public static boolean hasOne(int n) {

		  while (n > 0) {
		    if (n % 10 == 1) return true;
		    n /= 10;
		  }
		  return false;
		  
		}
	public static boolean hasOneStringMethod(int n) {
	
		  String check = String.valueOf(n);
		  
		  for (int i = 0 ; i < check.length() ; i++) 
		    if (check.charAt(i) == '1') return true;
		    
		  return false;
	}
	public static void main(String args[]) {
		int testNumber = 11112221;
		
		System.out.println("Testing using the two methods: ");
		System.out.println(hasOne(testNumber));
		System.out.println(hasOneStringMethod(testNumber));
	}
}
