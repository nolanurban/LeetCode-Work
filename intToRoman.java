public class intToRoman {

    /*
    * On the previous roman to int I utilized a hashmap.  It seems like this one favors utilizing an two arrays
    * but I do wonder if it could be done in key-value pairs.
    *
    * essentially, populate a same size array of integers with all the specialty ones we need
    * and populate a same size array of strings to concat the roman integer.  Then, run through the values
    * deducting as need be.  Where ever there is a deduction, there is a concatenation.
    */

    public static String intToRoman(int num) {
        int romanIntValues[] = { 1000,  900, 500,  400, 100,   90,  50,   40,  10,    9,   5,    4,   1 };
        String romanStrValues[] = {  "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        // I've kept these aligned on purpose for readership
        String returnString = ""; // initialize an empty string to concat to.
        int i = 0; 
        
        while (num > 0) { // we will check nums value
        	if (num >= romanIntValues[i]) {
        		num -= romanIntValues[i];
        		returnString += romanStrValues[i];
        	}
        	System.out.println(returnString);
        	if (num < romanIntValues[i]) i++;

        }
        return returnString;
    }
    
	public static void main(String args[]) {
		int test = 3999;
		
		System.out.println("Final result: " + test + " Converted: " + intToRoman(test));
	}
	
}
