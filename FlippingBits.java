
public class FlippingBits {
	  /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */
   public static long flippingBits(long n) {

    return Long.parseLong("4294967295")-n;
    }
   
   public static void main(String args[]) {
	   String n = "4294967295";
	   System.out.println("With the bits flipped, total should be zero : " + flippingBits(Long.parseLong(n)));
   }

}
