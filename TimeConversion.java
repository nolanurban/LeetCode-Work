/*

Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

 */
public class TimeConversion {
	
	/*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {

    	String output = "";
    	// let's parse through this string and look for P and A.  -- position 8
    	// the part to remember:  if it's 12 AM it turns to 00 in military time
    	// if it's 12 PM it stays
    	// anything that is PM after that gets + 12
    	// anything that is PM before that stays.
    	// we'll need a string to concatenate to
    	
    	// hardest case is a midnight conversionA
    	if (s.substring(0,2).equals("12") && s.substring(8).equals("AM")) {
    		output += "00";
    		output += s.substring(2, 8);
    	}
    	
    	if (!s.substring(0,2).equals("12") && s.substring(8).equals("AM") || (s.substring(0,2).equals("12") && s.substring(8).equals("PM"))) {
    		output += s.substring(0,8);
    	}

       	if (s.substring(8).equals("PM") && !s.substring(0,2).equals("12")) {
       		int hour = Integer.parseInt(s.substring(0,2));
       		hour += 12;
    		output += hour + s.substring(2, 8);
    		}
    	
    	
    	
    	return output;
    }
    
    public static void main(String args[]) {
    	
    	String testTime = "12:01:00AM";
    	String testTime2 = "07:45:00PM";
    	
    	System.out.println("Testing midnight conversion to military time, should result in 00:01:00 -- " + timeConversion(testTime));
    	System.out.println("Testing noon conversion to military time, should stay the same and return 12:01:00 --" + timeConversion(testTime2));
    	
    }

}
